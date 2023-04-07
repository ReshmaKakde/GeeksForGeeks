class RemoveWhiteSpace
{
   
    String modify(String S)
    {
          
    return S;
     
    }
    public static void main(String [] args)
    {
     String S="geeks for geeks";
     
     S=S.replaceAll("\\s","");
     RemoveWhiteSpace m=new RemoveWhiteSpace();
    
       System.out.println(m.modify(S));
        
         }
}