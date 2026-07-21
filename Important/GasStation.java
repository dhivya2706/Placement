class GasStation{
    public static void main(String args[]){
        int[] gas={1, 2, 3, 4, 5};
        int[] cost={3, 4, 5, 1, 2};
        int gt=0;
        int ct=0;
        int idx=0;
        int cur=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            gt+=gas[i];
            ct+=cost[i];
        }
        if(gt<ct){
            System.out.println(idx);
            return;
        }
             
        for(int i=0;i<n;i++){
            cur+=gas[i]-cost[i];
            if(cur<0){
                cur=0;
                idx=i+1;
            }
        }
        System.out.println(idx);
    }
}