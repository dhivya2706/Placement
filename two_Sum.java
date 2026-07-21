import java.util.*;
public class two_Sum
{
	public static void main(String[] args) {
		int[] arr={2,6,5,8,11};
		int n=arr.length-1;
		Arrays.sort(arr);
		int t=14;
		int l=0;
		int s=0;
		while(l<=n)
		{
		    s=arr[l]+arr[n];
		    if(s==t)
		    {
		        System.out.println(arr[l]+","+arr[n]);
		        break;
		    }
		    else if(s<t)
		    {
		        l++;
		    }
		    else
		    {
		        n--;
		    }
		}
	}
}