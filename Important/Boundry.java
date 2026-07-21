public class Boundry {

    public static void main(String[] args){

        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int m=a.length;
        int n=a[0].length;

        for(int j=0;j<n;j++)
            System.out.print(a[0][j]+" ");

        for(int i=1;i<m;i++)
            System.out.print(a[i][n-1]+" ");

        for(int j=n-2;j>=0;j--)
            System.out.print(a[m-1][j]+" ");

        for(int i=m-2;i>0;i--)
            System.out.print(a[i][0]+" ");
    }
}