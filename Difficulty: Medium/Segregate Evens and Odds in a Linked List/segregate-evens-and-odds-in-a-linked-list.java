/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node evenHead = null;
        Node evenTail = null;
        
        Node oddHead = null;
        Node oddTail = null;
        
        Node current = head;
        
        while(current != null) {
            
            int value = current.data;
            
            if(value % 2 == 0) {
                if(evenHead == null) {
                    evenHead = current;
                    evenTail = evenHead;
                }
                else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            }
            else {
                if(oddHead == null) {
                    oddHead = current;
                    oddTail = oddHead;
                }
                else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }
        if(oddHead == null || evenHead == null) return head;
        
        evenTail.next = oddHead;
        
        oddTail.next = null;
        
        return evenHead;
    }
}














