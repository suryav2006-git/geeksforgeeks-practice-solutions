/* Node is defined as
  class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
};
*/
class Solution {
  public:
    Node* segregate(Node* head) {
        // code here
        
        if(head == nullptr || head -> next == nullptr) return head;
        
        Node *oneDummy = new Node(-1);
        Node *zeroDummy = new Node(-1);
        Node *twoDummy = new Node(-1);
        
        Node *zero = zeroDummy;
        Node *one = oneDummy;
        Node *two = twoDummy;
        
        Node *temp = head;
        
        while(temp != nullptr) {
            if(temp->data == 0) {
                zero -> next = temp;
                zero = zero -> next;
            }
            else if (temp->data == 1) {
                one -> next = temp;
                one = one -> next;
            }
            else {
                two -> next = temp;
                two = two -> next;
            }
            temp = temp->next;
        }
        zero -> next = (oneDummy -> next) ? (oneDummy -> next) : (twoDummy -> next);
        
        one -> next = twoDummy -> next;
        
        two -> next = nullptr;
        
        Node *newhead = zeroDummy -> next;
        
        delete zeroDummy;
        delete oneDummy;
        delete twoDummy;
        
        return newhead;
    }
};





