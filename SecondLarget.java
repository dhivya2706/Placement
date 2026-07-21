public class SecondLarget
 {
    public static void main(String[] args) {
        int[] arr={10,5,18,7,15};
        int n=arr.length;
        int l=arr[0];
        int sl=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl)
            {
                sl=arr[i];
            }
        }
        System.out.println(sl);
    }
}