/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node slow = head;
        Node fast = head;
        
        for(int i=0; i<k ; i++) {
            if(fast == null) return -1;
            
            fast = fast.next;
        }
        
        if(fast==null) return head.data;
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next.data;
    }
}