import java.util.*;
class Anagram
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1="listen";
        String s2="silent";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int l=s1.length();
        int l2=s2.length();
        if(l!=l2)
        {
            System.out.println("Not");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<l;i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("No");
                break;
            }
            else{
                System.out.println("Yes");
                break;
            }
        }
    }
}