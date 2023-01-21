

public class LinkedList{
    private Node head;
    private Node tail;
    static int size;
    public LinkedList(){
        head=null;

    }
    public void insert(int data){
        Node newnode = new Node(data);
        newnode.data = data;
        newnode.next =  head;
        head = newnode;
        if(size == 0){
            tail = newnode;
        }
        size++;
    }
    public void size(){
        System.out.println(size);
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next; 
        }
    }
public static void main(String[] args) {
    LinkedList l1 = new LinkedList();
    l1.insert(10);
    l1.insert(30);
    l1.display();

}
}
