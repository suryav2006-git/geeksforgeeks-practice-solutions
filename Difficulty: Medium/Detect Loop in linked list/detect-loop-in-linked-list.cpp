/*
class Node {
   public:
    int data;
    Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
} */

class Solution {
  public:
    bool detectLoop(Node* head) {
        // code here
        unordered_map<Node*, int> map;
        
        Node *temp = head;
        
        while(temp != nullptr) {
            if(map.find(temp) != map.end()) {
                return true;
            }
            map[temp] = 1;
            temp = temp->next;
        }
        return false;
    }
};