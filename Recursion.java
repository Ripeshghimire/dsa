class recursion_demo{
    public int fact (int n){
        if(n ==0 || n==1)
        return 1 ;
        else return(n*fact(n-1));
    }
    public int fibo(int n ){
        if(n==0)
            return 0;
            else if(n==1)
                return 1 ;
            else{
                return(fibo(n-1)+fibo(n-2));
            
        }
    }
    public int sum(int n ){
        if(n==0 || n==1)
            return 1;
        else return(n+sum(n-1));
    
}
}
public class Recursion {
    public static void main(String[] args) {
        recursion_demo r1 = new recursion_demo();
        System.out.println(r1.fact(5));
        for(int i = 0 ;i<12;i++){
            System.out.println(r1.fibo(i));
        }
    }
}
