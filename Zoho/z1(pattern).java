import java.util.regex.*;

public class z1(pattern) {
    public static void main(String[] args) {

        String text = "abcbbcabb";
        String pattern = "cb*cab+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println(m.group());
        } else {
            System.out.println("No Match");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        String text = "abcbbcabb";
        String pattern = "cb*cab+";

        for (int i = 0; i < text.length(); i++) {

            int j = i;
            if (j >= text.length() || text.charAt(j) != 'c')
                continue;
            j++;
            while (j < text.length() && text.charAt(j) == 'b')
                j++;
            if (j >= text.length() || text.charAt(j) != 'c')
                continue;
            j++;
            if (j >= text.length() || text.charAt(j) != 'a')
                continue;
            j++;
            int start = j;

            while (j < text.length() && text.charAt(j) == 'b')
                j++;

            if (j > start) {
                System.out.println(text.substring(i, j));
                return;
            }
        }
        System.out.println("No Match");
    }
}