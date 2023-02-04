
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Ripesh{
    static Node head;
    Node tail;
    int size;
    Node prev;
    public Ripesh(){
        this.head = null;
    }
    public void insertfirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    } 
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void deletenode(Node head,int position){
        if(position==0){
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < position-1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next= newnode;
    }
    //inserting using recursion in a linked list 
    public void insertrecursion(int data){

    }


    public static void main(String[] args) {
        Ripesh r1 = new Ripesh();
        r1.insertfirst(20);
        r1.insertfirst(30);
        r1.insertfirst(43);
        r1.addlast(32);
        r1.display();


    }
}
