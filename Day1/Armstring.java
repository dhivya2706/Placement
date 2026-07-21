import java.util.*;
class s2
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            sum+=(rem*rem*rem);
        }
        if(sum==n1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}