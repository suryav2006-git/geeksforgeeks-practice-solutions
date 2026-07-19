/* Node Structure
struct Node {
    int data;
    struct Node* next;
    Node(int x) {
        data = x;
        next = nullptr;
    }
}; */

class Solution {
  public:
    Node* deleteMid(Node* head) {
        // code here
        if(head==nullptr || head->next == nullptr) return nullptr;
        
        Node *slow = head;
        Node *fast = head;
        
        fast = fast->next->next;
        
        while(fast!=nullptr && fast->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        slow->next = slow->next->next;
        
        return head;
    }
};