
import java.util.*;

class twosum{
    public static void main(String args[]){
        int[] arr={1, 5, 7, -1, 5};
        int t=6;
        List<List<Integer>> l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int s=arr[i]+arr[j];
                if(s==t)
                {
                    List<Integer> l1=new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    l.add(l1);
                }
                
            }
        }
        System.out.println(l);
    }
}