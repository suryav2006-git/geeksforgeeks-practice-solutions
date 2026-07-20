/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    
    public int countLength(Node slow) {
        int count = 0;
        Node temp = slow;
        
        while(temp.next != null) {
            count++ ;
            temp = temp.next;
            
            if(temp == slow) break;
        }
        return count;
    }
    
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                return countLength(slow);
            }
        }
        return 0;
    }
}