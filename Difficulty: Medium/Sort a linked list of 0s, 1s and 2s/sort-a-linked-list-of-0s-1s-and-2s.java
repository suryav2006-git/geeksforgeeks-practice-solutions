/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node segregate(Node head) {
        // code here
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);
        
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;
        
        Node temp = head;
        
        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        
        zero.next = (oneDummy.next!=null) ? (oneDummy.next) : (twoDummy.next);
        
        one.next = twoDummy.next ;
        
        two.next = null;
        
        Node newNode = zeroDummy.next;
        
        return newNode;
    }
}















