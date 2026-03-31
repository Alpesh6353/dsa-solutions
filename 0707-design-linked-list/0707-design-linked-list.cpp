class Node{
public:
    int val;
    Node* next;

    Node(int val){
        this->val = val;
        this->next = NULL;
    }
};
class MyLinkedList {
public:

    Node* head;
    Node* tail;
    int size;
    MyLinkedList() {
        this->head = NULL;
        this->tail = NULL;
        this->size = 0;
    }
    
    int get(int index) {
        if(size==0 || index>=size) return -1;
        else if(index==0) return head->val;
        else if(index==size-1) return tail->val;
        else{
            Node* obj = head;
            for(int i=1;i<=index;i++){
                obj = obj->next;
            }
            return obj->val;
        }
    }
    
    void addAtHead(int val) {
        Node* obj = new Node(val);
        if(size==0) head=tail=obj;
        else{
            obj->next = head;
            head = obj;
        }
        size++;
    }
    
    void addAtTail(int val) {
        Node* obj = new Node(val);
        if(size==0) head=tail=obj;
        else{
            tail->next = obj;
            tail = obj;
        }
        size++;
    }
    
    void addAtIndex(int index, int val) {
        if(index > size) return;
        else if(index==0) addAtHead(val);
        else if(index==size) addAtTail(val);
        else{
            Node* temp = new Node(val);
            Node* obj = head;
            for(int i=1;i<index;i++){
                obj = obj->next;
            }
            temp->next = obj->next;
            obj->next = temp;
            size++;
        }
    }
    
    void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        else if(index==0) head = head->next;
        else if(index==size-1){
            Node* obj = head;
            while(obj->next != tail){
                obj = obj->next;
            }
            obj->next = NULL;
            tail = obj;
        }
        else{
            Node* obj = head;
            for(int i=1;i<index;i++){
                obj = obj->next;
            }
            obj->next = obj->next->next;
        }
        size--;
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */