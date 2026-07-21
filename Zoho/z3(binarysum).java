public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        int carry = 0;
        int place = 1;
        int result = 0;

        while (a > 0 || b > 0 || carry > 0) {

            int bit1 = a % 10;
            int bit2 = b % 10;

            int sum = bit1 + bit2 + carry;

            int bit = sum % 2;
            carry = sum / 2;

            result = bit * place + result;

            place *= 10;
            a /= 10;
            b /= 10;
        }

        System.out.println(result);
    }
}