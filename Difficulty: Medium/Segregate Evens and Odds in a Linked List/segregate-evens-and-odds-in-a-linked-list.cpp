/* Structure of a link list node
class Node {
  public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};
*/

class Solution {
  public:

    Node *divide(Node *head) {
        // code here
        Node *evenHead = nullptr;
        Node *evenTail = nullptr;
        
        Node *oddHead = nullptr;
        Node *oddTail = nullptr;
        
        Node *current = head;
        
        while(current != nullptr) {
            int value = current->data;
            
            if(value % 2 == 0) {
                if(evenHead == NULL) {
                    evenHead = current;
                    evenTail = evenHead;
                }
                else {
                    evenTail -> next = current;
                    evenTail = evenTail -> next;
                }
            }
            else {
                if(oddHead == NULL) {
                    oddHead = current;
                    oddTail = oddHead;
                }
                else {
                    oddTail->next = current;
                    oddTail = oddTail -> next;
                }
            }
            
            current = current -> next;    
        }
        if(oddHead == NULL || evenHead==NULL) return head;
        
        evenTail -> next = oddHead;
        
        oddTail ->next = nullptr;
        
        return evenHead;
    }
};








