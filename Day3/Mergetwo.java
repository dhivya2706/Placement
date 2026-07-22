class Mergetwo{
    public static void main(String args[]){
        int[] a1={1,3,5};
        int[] a2={2,4,6};
        int n=a1.length;
        int m=a2.length;
        int i=0;
        int j=0;
        int[] a3=new int[n+m];
        int k=0;
        while(i<m && j<n){
            if(a1[i]<a2[j]){
                a3[k]=a1[i];
                k++;
                i++;
            }
            else{
                a3[k]=a2[j];
                k++;
                j++;
            }
        }
        for(int l=0;l<k;l++){
            System.out.println(a3[l]);
        }
    }
}