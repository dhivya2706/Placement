public class Main {

    public static void main(String[] args) {

        int n = 7;
        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == mid) {
                    System.out.print((j + 1) + " ");
                }
                else if (j == mid || j == i || j == n - i - 1) {
                    System.out.print((i + 1) + " ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}