class chnage{
    public static void main(String args[]){
        String s="Hi Hell";
        String[] a=s.split(" ");
        String[] a1=new String[a.length];
        int x=0;
        int y=0;
        String s2="";
        for(int i=0;i<a.length;i++){
            String s1=a[i];
            s2="";
            int n=s1.length();
            for(int j=0;j<n;j++){
                char ch=s1.charAt(j);
                x=ch;
                y=x+n;
                s2+=(char)y;
            }
            System.out.print(s2+" ");
            }
        }
    }
