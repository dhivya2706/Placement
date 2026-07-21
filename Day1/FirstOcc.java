class FirstOcc{
    public static void main(String args[]){
        int[] arr={1,2,3,1,2,3};
        int n=arr.length;
        int res=0;
        boolean flag2=false;
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                res=arr[i];
                flag2=true;
                break;
            }
        }
        if(flag2){
            System.out.println(res);
        }
        else{
            System.out.println("No found");
        }
    }
}