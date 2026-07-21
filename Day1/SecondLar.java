import java.util.*;
class SecondLar
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={2,5,1,4,9};
        int n=arr.length;
        int maxi=arr[0];
        int smaxi=0;
        for(int i=1;i<n;i++){
            if(arr[i]>maxi){
                smaxi=maxi;
                maxi=arr[i];
            }
        }
        System.out.println(smaxi);
    }
}