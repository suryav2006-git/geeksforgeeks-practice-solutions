/*
class Node {
public:
    int data;
    Node* next;
    Node(int data) {
        this->data = data;
        this->next = nullptr;
    }
};
*/
class Solution {
  public:
    Node *deleteFront(Node *head) {
        Node *temp = head;
        head = head -> next ;
        delete temp;
        return head;
    }
  
    Node* deleteNode(Node* head, int x) {
        // code here
        if(head == nullptr) return head;
        
        if(x == 1) {
            return deleteFront(head);
        }
        int count = 0;
        Node *prev = nullptr;
        Node *temp = head ;
        
        while(temp != nullptr) {
            count++ ;
            if(count == x) {
                prev -> next = prev -> next -> next ;
                delete temp;
                break;
            }
            prev = temp;
            temp = temp -> next;
        }
        return head;
    }
};