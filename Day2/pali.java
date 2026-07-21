
import java.util.*;

class pali {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int[] arr = new int[10];
        while (n > 0) {
            int rem = n % 10;
            arr[rem]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] %2!= 0) {
                c++;
            }
        }
        if(c<=1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
