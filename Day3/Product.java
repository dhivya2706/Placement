class Product
{
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        int mul=1;
        int k=0;
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++){
               if(i!=j){
                mul*=arr[j];
               } 
            }
            a[k]=mul;
            k++;
            mul=1;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}