import java.util.*;
class freqchar
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n="programming";
        int l=n.length();
        int[] fre=new int[26];
        for(int i=0;i<l;i++){
            fre[(n.charAt(i))-'a']++;
        }
        for(int j=0;j<n.length();j++)
        {
            char ch=n.charAt(j);
            if(fre[ch-'a']!=0)
            {
                System.out.println(ch+"->"+fre[ch-'a']);
                fre[ch-'a']=0;
            }
        }
    }
}