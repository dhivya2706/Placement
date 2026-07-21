
import java.util.*;

class cprime {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        boolean flag = false;
        while (n > 0) {
            flag = true;
            int rem = n % 10;
            if (rem < 2) {
                flag = false;
            } else {
                for (int i = 2; i * i <= rem; i++) {
                    if (rem % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                c++;
            }
            n /= 10;
        }
        System.out.println(c);
    }
}
