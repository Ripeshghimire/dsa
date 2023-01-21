
public class Stack {
    int data[];
    int top;
    public Stack(){
        data = new int[10];
        top = -1;
    }
    public void push(int x){
        if(top<10){
            ++top;
            data[top] = x;
            }
        }
    public void pop(){
        if(top>-1){
            System.out.println("Popped: "+data[top]);
            --top;
        
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(data[i]);
    }
}
public void topjk(){
    System.out.println(top);
}
public static void main(String[] args) {
    Stack s1 = new Stack();
    s1.push(12);
    s1.push(32);
    s1.push(39);
    s1.push(344);
    s1.pop();
    s1.display();   
   s1.topjk();
}
}
