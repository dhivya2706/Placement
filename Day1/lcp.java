class lcp
{
    public static void main(String args[]){
        String[] arr={"flower", "flow", "flight"};
        String res="";
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            for(int j=1;j<arr.length;j++){
                if(i>=arr[j].length() || arr[j].charAt(i)!=ch)
                {
                    System.out.println(res);
                    return;
                }
            }
            res+=ch;
        }
        System.out.println(res);
    }
}