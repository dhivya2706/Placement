public class leaders {

    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int maxi=arr[n-1];
        System.out.println(maxi);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>maxi)
            {
                System.out.println(arr[i]);
                maxi=arr[i];
            }
        }
    }
}