import java.nio.channels.ClosedSelectorException;

class nodes{
    char[] nodes;
    public nodes(){
        nodes = new char[10];
    }
    public void setNode(char[] nodes){
        this.nodes = nodes;
    }
    public void showNodes(){
        for (int i = 0; i < nodes.length; i++) {
            System.out.println(nodes[i]);
        }
    }
}

class Edges {
    char src,dest;
    int wt;
    public Edges(){}
    public void setEdges(char s,char d,int w){
        src =s ;
        dest = d;
        wt =w ;
    }
    public void showEdges(){
        System.out.println("Edges :" +src +"----"+wt +"---"+dest);
    }
}
public class Graph{
    public static void main(String[] args) {
        char n[] = {'a','b','c','d','e','f'};
        nodes gn = new nodes();
        gn.setNode(n);
        gn.showNodes();
        Edges[] ee = new Edges[7]; 
        int j ;
        for ( j = 0; j < 7; j++) {
            ee[j] = new Edges();
        }
    ee[0].setEdges(n[0],n[1],9 );
    ee[1].setEdges(n[1],n[2],4 );
    ee[2].setEdges(n[2],n[3],5 );
    ee[3].setEdges(n[3],n[4],9 );
    ee[4].setEdges(n[4],n[4],9 );
    ee[5].setEdges(n[2],n[1],9 );
    ee[6].setEdges(n[3],n[1],9 );
    //ee[].setEdges(n[4],n[1],9 );
    for(int i = 0;i<7;i++){
        ee[i].showEdges();
        //ClosedSelectorException
    }
  }
}
