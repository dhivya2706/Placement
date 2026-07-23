class Rotation {
    public static void main(String args[]) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        String temp = s1 + s1;

        if (temp.contains(s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}