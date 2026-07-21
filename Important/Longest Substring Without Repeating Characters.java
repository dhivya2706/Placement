import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 String str="abcabcbb";
		 int win=0;
		 Set<Character> s=new HashSet<>();
		 int j=0;
		 for(int i=0;i<str.length();i++)
		 {
		     if(s.contains(str.charAt(i)))
		     {
		         s.remove(str.charAt(j));
		         j++;
		     }
		     s.add(str.charAt(i));
		     win=Math.max(win,i-j+1);
		 }
		 System.out.println(win);
	}
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "abcabcbb";

        int[] last = new int[256];
        Arrays.fill(last, -1);

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            if (last[ch] >= left) {
                left = last[ch] + 1;
            }

            last[ch] = right;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}