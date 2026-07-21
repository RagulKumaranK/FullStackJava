class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        
        
        head  = insertAtFirst(head,10);
        head  = insertAtEnd(head,50);
        head  = insertAtPos(head,3,60);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



    public static Node insertAtFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }



    public static Node insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        Node temp = head ;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }


    public static Node insertAtPos(Node head, int pos, int data){
        Node newNode = new Node(data);
        Node temp = head ;
        for(int i =0; i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode; 
        return head;
    }
}

