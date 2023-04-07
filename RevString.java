class RevString {
    static String revStr(String S) {
       
        
        char ch[] =S.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev+=ch[i];
        }
        return rev;
    }
public static void main(String [] args)
{   
String S="GeeksforGeeks";
    System.out.println(revStr(S));
}
}