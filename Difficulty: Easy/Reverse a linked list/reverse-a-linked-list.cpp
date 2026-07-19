/*
class Node {
 public:
    int data ;
    Node *next ;

    Node(int x) {
        data = x ;
        next = nullptr ;
    }
};
*/

class Solution {
  public:
    Node* reverseList(Node* head) {
        // code here
        Node *prev = nullptr;
        Node *current = head;
        Node *next = head;
        
        while(current != nullptr) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        
        return head;
    }
};