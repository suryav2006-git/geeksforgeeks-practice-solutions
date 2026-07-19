/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteFront(Node head) {
        head = head.next;
        return head;
    }
    
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null) return head;
        if(x == 1) {
            return deleteFront(head);
        }
        
        int count = 0;
        Node prev = null;
        Node temp = head;
        
        while(temp != null) {
            count++ ;
            if(count==x) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}