/*
class Node {
 public:
    int data;
    Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};
*/

class Solution {
  public:
    int lengthOfLoop(Node *head) {
        // code here
        unordered_map<Node*, int> map;
        
        Node *temp = head;
        int count = 0;
        
        while(temp != NULL) {
            
            if(map.find(temp) != map.end()) {
                int value = map[temp];
                return count - value;
            }
            map[temp] = count;
            
            count++ ;
            
            temp = temp->next;
        }
        return 0;
    }
};