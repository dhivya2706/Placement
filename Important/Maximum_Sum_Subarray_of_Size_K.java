public class Maximum_Sum_Subarray_of_Size_K
{
	public static void main(String[] args) {
		 int[] arr={2,1,5,1,3,2};
		 int k=3;
		 int win=0;
		 for(int i=0;i<k;i++)
		 {
		     win+=arr[i];
		 }
		 int maxi=win;
		 for(int i=k;i<arr.length;i++)
		 {
		     win+=arr[i];
		     win-=arr[i-k];
		     maxi=Math.max(win,maxi);
		 }
		 System.out.println(maxi);
	}
}