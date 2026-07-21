import java.util.*;

public class Main {

    public static void main(String[] args) {

        String s = "a(b(c){2}){2}d";

        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ')') {

                String temp = "";

                while (!st.peek().equals("(")) {
                    temp = st.pop() + temp;
                }

                st.pop(); 

                i++;      
                i++;     

                int count = s.charAt(i) - '0';

                i++;      

                String ans = "";

                while (count-- > 0)
                    ans += temp;

                st.push(ans);
            }
            else if (ch == '{' || ch == '}') {
                continue;
            }
            else {
                st.push(String.valueOf(ch));
            }
        }

        String result = "";

        while (!st.isEmpty())
            result = st.pop() + result;

        System.out.println(result);
    }
}