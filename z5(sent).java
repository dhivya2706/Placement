public class Main {

    static boolean contains(String[] words, String[] fragment) {

        for (int i = 0; i <= words.length - 3; i++) {

            if (words[i].equals(fragment[0]) &&
                words[i + 1].equals(fragment[1]) &&
                words[i + 2].equals(fragment[2])) {
                return true;
            }
        }
        return false;
    }

    static String removeFragment(String[] words, String[] fragment) {

        String ans = "";

        for (int i = 0; i < words.length;) {

            if (i <= words.length - 3 &&
                    words[i].equals(fragment[0]) &&
                    words[i + 1].equals(fragment[1]) &&
                    words[i + 2].equals(fragment[2])) {

                i += 3;         
            } else {
                ans += words[i] + " ";
                i++;
            }
        }

        return ans.trim();
    }

    public static void main(String[] args) {

        String s1 = "Every morning I want to do exercise regularly";
        String s2 = "Every morning I want to do meditation without fail";
        String s3 = "It is important that I want to be happy always";

        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        String[] c = s3.split(" ");

        for (int i = 0; i <= a.length - 3; i++) {

            String[] fragment = {a[i], a[i + 1], a[i + 2]};

            if (contains(b, fragment) && contains(c, fragment)) {

                System.out.println("Removed Fragment = "
                        + fragment[0] + " "
                        + fragment[1] + " "
                        + fragment[2]);

                System.out.println(removeFragment(a, fragment));
                System.out.println(removeFragment(b, fragment));
                System.out.println(removeFragment(c, fragment));

                return;
            }
        }
    }
}