import java.util.*;
class reverse
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res="";
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            String r=""+rem;
            res+=r;
        }
        System.out.println(res);
    }
}