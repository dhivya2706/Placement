
import java.util.*;

class unisum {

    public static int check(int s) {
        if (s < 10) {
            return s;
        }
        int x = 0;
        while (s > 0) {
            int r = s % 10;
            s /= 10;
            x += r;
        }
        return check(x);
    }

    public static void main(String args[]) {
        int[] a1 = {1, 4, 6, 9, 3};
        int[] a2 = {2, 4, 5, 6, 3};
        int[] a3 = new int[10];
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                k++;
                i++;
            } else if (a1[i] > a2[j]) {
                a3[k] = a2[j];
                k++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        while (i < a1.length) {
            a3[k++] = a1[i++];
        }

        while (j < a2.length) {
            a3[k++] = a2[j++];
        }
        int s = 0;
        for (int l = 0; l < k; l++) {
            s += a3[l];
        }
        int res = check(s);
        System.out.println(res);
    }
}
