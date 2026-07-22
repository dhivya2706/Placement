class BuySell{
    public static void main(String args[]){
       int[] arr={7,1,5,3,6,4};
       int minp=arr[0];
       int maxi=0;
       for(int i=1;i<arr.length;i++){
        minp=Math.min(minp,arr[i]);
        maxi=Math.max(maxi,arr[i]-minp);
       }
       System.out.println(maxi);
    }
}