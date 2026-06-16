class MyLinkedList {
    Node head ;
    int size ;
    class Node {
        int data ;
        Node next ;
        Node (int data){
            this.data = data ;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0 ;
        
    }
    
    public int get(int index) {
    if (index >= size || index < 0) return -1;
    int i = 0;
    Node temp = head;
    while (i < index) {
        temp = temp.next;
        i++;
    }
    return temp.data;
}
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next=head;
        head = n;
        size++;
        
    }
    
    public void addAtTail(int val) {
       
        Node n = new Node(val);
        Node temp = head ;
        if (temp == null){
            addAtHead(val);
            return ;
        }
        while (temp.next != null)temp = temp.next;
        temp.next = n;
         size ++;
    }
    
    public void addAtIndex(int index, int val) {
        if ( index > size || index < 0) return;
        if ( index == size) {
            addAtTail(val); 
            return; 
            }
        if ( index == 0) {
            addAtHead(val);
            return; 
            }

        Node n = new Node(val);
        Node temp = head;
        for ( int i = 0 ;i< index-1 ; i++){
            temp=temp.next;
        }
         n.next = temp.next;
         temp.next=n;
         size++;
    }
    
    public void deleteAtIndex(int index) {
        
         if ( index >= size || index < 0) return;
         size--;
         if ( index == 0 ){
            head = head.next ;
            return ;
         }
         Node temp = head;
         for ( int i =0; i< index -1 ;i++){
            temp=temp.next;
         }
         temp.next=temp.next.next;

        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */