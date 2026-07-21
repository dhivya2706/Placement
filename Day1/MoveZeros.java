
import java.util.*;
class MoveZeros
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}