public class Main {

    public static void main(String[] args) {

        int a[]={1,3,5,6};
        int b[]={4,7,8};

        int k=5;

        int i=0,j=0,count=0;

        while(i<a.length && j<b.length){

            int x;

            if(a[i]<b[j]){
                x=a[i++];
            }
            else{
                x=b[j++];
            }

            count++;

            if(count==k){
                System.out.println(x);
                return;
            }
        }

        while(i<a.length){

            count++;

            if(count==k){
                System.out.println(a[i]);
                return;
            }

            i++;
        }

        while(j<b.length){

            count++;

            if(count==k){
                System.out.println(b[j]);
                return;
            }

            j++;
        }
    }
}