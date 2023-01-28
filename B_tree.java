class BtreeNode{
    int m,numberofkeys;
    boolean leaf = true;
    int keys[];
    BtreeNode reference[];
    BtreeNode(int m ,int key,int n ){
        this.m= m;
        keys = new int[m-1];
        reference = new BtreeNode[m];
        keys[0] = key;
        for( int  i = 0; i<m;i++){
            reference[i] = null; 
        }

    }
}
