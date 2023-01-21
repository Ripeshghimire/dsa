public class Queue {
    int rear,front;;
    int data[];
    public Queue(){
        rear = -1;
        front = -1;
        data = new int[10];
    }
    public void insert(int a ){
        if(rear<10){
            ++rear;
            data[rear]=a;
        }
    }
    public void remove(){
        if(rear == -1){
            System.out.println("Removed:"+data[front]);
        }
    }
    public void display(){
        try {
            for(int i =front;i<=rear;i++){
                System.out.println(data[i]+" ");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
       
    }
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.insert(32);
        q1.insert(34);
        q1.insert(43);
        q1.remove();
        q1.display();
    }
}
