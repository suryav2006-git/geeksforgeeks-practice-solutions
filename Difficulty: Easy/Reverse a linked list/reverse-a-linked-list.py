"""
class Node:
    def __init__(self, val):
        self.data = val
        self.next = None
"""

class Solution:
    def reverseList(self, head):
        # Code here
        prev = next = None 
        current = head
        
        while (current) :
            next = current.next
            current.next = prev
            prev = current 
            current = next
            
        head = prev
        return head
        