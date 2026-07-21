String s="2[ab]c";

int count=s.charAt(0)-'0';

String temp="";

int i=2;

while(s.charAt(i)!=']'){
    temp+=s.charAt(i);
    i++;
}

while(count-->0)
    System.out.print(temp);

for(i=i+1;i<s.length();i++)
    System.out.print(s.charAt(i));