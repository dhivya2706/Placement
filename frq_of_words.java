public class frq_of_words {

    public static void main(String[] args){

        String s="program";

        boolean[] visited=new boolean[256];

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(visited[ch])
                continue;

            int count=1;

            for(int j=i+1;j<s.length();j++){

                if(ch==s.charAt(j))
                    count++;
            }

            visited[ch]=true;

            System.out.println(ch+" -> "+count);
        }
    }
}