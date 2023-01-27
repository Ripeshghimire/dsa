import java.util.*;
class node{
    int data;
    node left,right;
    public node(int d){
        data = d;
        left = right = null;
    }
}
class binary_tree{
    node root=null;
    node temp;
    public void insertNode(node n){
        if(root ==null){
            root = n;
        }else{
            temp = root;
            while(temp!=null){
                if(temp.data>n.data){
                    if(temp.left == null){
                        temp.left = n;
                        break;
                    }else
                    temp = temp.left;
                }
                else if(temp.data <=n.data){
                    if(temp.right == null){
                        temp.right = n;
                        break;
                    }else
                    temp = temp.right;
                }
            }
        }
    }
    public void inorder(node r){
        if(r!=null){
            inorder(r.left);
            System.out.println(" "+r.data);
            inorder(r.right);
        }
    }
    public node getRoot(){
        return root;
    }
}
class binary_tree_demo{
    public static void main(String[] args){
        node temp;
        Scanner sc = new Scanner(System.in);
        int option,value;
        binary_tree bt = new binary_tree();
        while(true){
            System.out.println("\n1.InsertNode\n2.DisplayTree\n8.Exit");
            option = sc.nextInt();
            switch(option){
                case 1:System.out.println("Enter a value:");
                    value = sc.nextInt();
                    temp = new node(value);
                    bt.insertNode(temp);
                break;
                case 2: System.out.println("Display Tree:");
                    bt.inorder(bt.getRoot());
                break;
                case 8:System.exit(0);
            }
        }
    }
}