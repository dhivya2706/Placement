class CheckRot{
    public static void main(String args[]){
        int[] arr={2,1,3,4};
        int n=arr.length;
        int c=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                c++;
            }
        }
        if(arr[n-1]>arr[0]){
            c++;
        }
        if(c<=1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}