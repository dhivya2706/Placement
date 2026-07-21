public class Main {

    public static void main(String[] args) {
            int[] arr={5,5,1,1,1,4,4,4,4,2};
            int n=arr.length;
            int c=1;
            int cs=arr[0];
            int m=1;
            int ms=arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i]==arr[i-1])
                {
                    c++;
                    cs+=arr[i];
                }
                else
                {
                    if(c>m)
                    {
                        m=c;
                        ms=cs;
                    }
                    
                    c=1;
                    cs=arr[i];
                }
            }
            
            if(c>m)
            {
                m=c;
                ms=cs;
            }
            System.out.println(ms);
        
    }
}