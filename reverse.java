public class reverse {

    public static void main(String[] args) {

        String s = "I love Java";

        int end = s.length()-1;

        while(end >= 0){

            while(end >= 0 && s.charAt(end)==' ')
                end--;

            if(end < 0)
                break;

            int start = end;

            while(start >= 0 && s.charAt(start)!=' ')
                start--;

            for(int i=start+1;i<=end;i++)
                System.out.print(s.charAt(i));

            System.out.print(" ");

            end = start-1;
        }
    }
}