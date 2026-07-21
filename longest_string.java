public class longest_string {

    public static void main(String[] args) {

        String str = "I came by bus late";

        String word = "";
        String longest = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                if (word.length() > max) {
                    max = word.length();
                    longest = word;
                }
                word = "";
            }
        }
        if (word.length() > max) {
            longest = word;
        }

        System.out.println(longest);
    }
}