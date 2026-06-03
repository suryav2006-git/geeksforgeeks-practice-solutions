import requests

USERNAME = "mrstudieshelper"

README = "README.md"

url = f"https://gfg-stats.tashif.codes/{USERNAME}/profile"

response = requests.get(url, timeout=20)

data = response.json()

monthly_score = data.get("monthlyScore", "N/A")
coding_score = data.get("codingScore", "N/A")
total_solved = data.get("totalProblemsSolved", "N/A")

with open(README, "r", encoding="utf-8") as f:
    content = f.read()

stats_text = f"""
🏆 Coding Score: {coding_score}
"""

monthly_text = f"""
🔥 Monthly Coding Score: {monthly_score}
"""

total_text = f"""
✅ Total Problems Solved: {total_solved}
"""

def replace_section(content, start, end, new_text):
    before = content.split(start)[0]
    after = content.split(end)[1]
    return before + start + "\n" + new_text + "\n" + end + after

content = replace_section(
    content,
    "<!-- GFG-STATS-START -->",
    "<!-- GFG-STATS-END -->",
    stats_text
)

content = replace_section(
    content,
    "<!-- MONTHLY-SCORE-START -->",
    "<!-- MONTHLY-SCORE-END -->",
    monthly_text
)

content = replace_section(
    content,
    "<!-- TOTAL-SOLVED-START -->",
    "<!-- TOTAL-SOLVED-END -->",
    total_text
)

with open(README, "w", encoding="utf-8") as f:
    f.write(content)

print("README updated successfully.")
