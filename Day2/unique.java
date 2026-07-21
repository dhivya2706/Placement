class unique{
    public static void main(String args[]){
        int n=29332;
        int c=0;
        int[] frq=new int[10];
        while(n>0){
            int rem=n%10;
            if(frq[rem]==0)
            {
                frq[rem]++;
                c++;
            }
            n/=10;
        }
        System.out.println(c);
    }
}