public class Equilibrium {

    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        int n=arr.length;
        int l=0;
        int t=0;
        for(int i=0;i<n;i++)
        {
            t+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            t-=arr[i];
            if(l==t)
            {
                System.out.println(i);
                break;
            }
            l+=arr[i];
        }
    }
}