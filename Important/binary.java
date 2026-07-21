public class binary
{
	public static void main(String[] args) {
		int[] arr={1,3,5,7,9};
		int r=arr.length-1;
		int t=7;
		int l=0;
		while(l<=r)
		{
		    int m=l+(r-l)/2;
		    if(arr[m]==t)
		    {
		        System.out.println(arr[m]);
		        break;
		    }
		    else if(arr[m]<t)
		    {
		        l++;
		    }
		    else
		    {
		        r--;
		    }
		}
	}
}