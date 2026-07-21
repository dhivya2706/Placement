class frq2
{
    public static void main(String args[])
    {
        int frq = 2;

        int[] arr = {1,1,1,1,2,2,2,3,3,4,4,4,4,5,5,5};

        int count = 1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if(count>frq)
                {
                    System.out.println(arr[i-1]+" -> "+count);
                }
                count=1;
            }
        }
        if(count>frq)
        {
            System.out.println(arr[arr.length-1]+" -> "+count);
        }
    }
}