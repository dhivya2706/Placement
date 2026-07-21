public class Main {

    public static void main(String[] args) {

        String s = "2a3bc";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                int count = s.charAt(i) - '0';

                i++;

                while (count > 0) {
                    System.out.print(s.charAt(i));
                    count--;
                }

            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}