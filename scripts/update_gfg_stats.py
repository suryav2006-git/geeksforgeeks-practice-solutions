import requests
import re
from datetime import datetime

USERNAME = "mrstudieshelper"

README_FILE = "README.md"

API_URL = f"https://gfg-stats.tashif.codes/{USERNAME}/profile"

try:
    response = requests.get(API_URL, timeout=20)
    data = response.json()
except Exception as e:
    print("Failed to fetch stats:", e)
    exit(1)

total_solved = (
    data.get("totalProblemsSolved")
    or data.get("problemSolved")
    or "N/A"
)

coding_score = (
    data.get("codingScore")
    or "N/A"
)

institute_rank = (
    data.get("instituteRank")
    or data.get("institutionRank")
    or "N/A"
)

current_streak = (
    data.get("currentStreak")
    or data.get("streak")
    or "N/A"
)

last_updated = datetime.utcnow().strftime("%Y-%m-%d %H:%M UTC")

stats_block = f"""
| Metric | Value |
|---------|---------|
| ✅ Total Solved | {total_solved} |
| 🏆 Coding Score | {coding_score} |
| 🎓 Institute Rank | {institute_rank} |
| 🔥 Current Streak | {current_streak} |
| 🕒 Last Updated | {last_updated} |
"""

with open(README_FILE, "r", encoding="utf-8") as f:
    readme = f.read()

pattern = re.compile(
    r"<!-- GFG_STATS_START -->(.*?)<!-- GFG_STATS_END -->",
    re.DOTALL
)

replacement = (
    "<!-- GFG_STATS_START -->\n"
    + stats_block
    + "\n<!-- GFG_STATS_END -->"
)

updated = pattern.sub(replacement, readme)

with open(README_FILE, "w", encoding="utf-8") as f:
    f.write(updated)

print("README updated successfully.")
