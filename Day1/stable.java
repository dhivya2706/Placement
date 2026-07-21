
class stable{
    public static void main(String args[]){
        int[] arr={10,12,11,14};
        int s=3;
        int t=12;
        int maxi=0;
        int c=0;
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= t) {
                c++;
            } else {
                maxi = Math.max(maxi, c);
                c = 0;
            }
        }
        maxi=Math.max(maxi,c);
        if(maxi>=s)
        {
            System.out.println(maxi);
        }
        else{
            System.out.println(0);
        }
    }
}