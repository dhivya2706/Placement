public class Main {

    public static void main(String[] args) {

        String v1 = "9.0.23";
        String v2 = "9.0.24";

        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");

        int n = Math.max(a.length, b.length);

        for (int i = 0; i < n; i++) {

            int x = (i < a.length) ? Integer.parseInt(a[i]) : 0;
            int y = (i < b.length) ? Integer.parseInt(b[i]) : 0;

            if (x < y) {
                System.out.println("Upgraded");
                return;
            }
            else if (x > y) {
                System.out.println("Downgraded");
                return;
            }
        }

        System.out.println("Equal");
    }
}