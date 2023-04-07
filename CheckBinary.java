class CheckBinary
{
	boolean isBinary(String str)
	{
	 int n=str.length();
	 int  i=0;
	 for( i=0;i<n;i++)
	 {
	 if(str.charAt(i)!='0' && str.charAt(i)!='1')
	 {
   return false;
    } 
   else
   {
   return true;
  }
  }
 return true;
 }
 public static void main(String [] args)
	  {
	      String str="10011";
	     CheckBinary obj=new CheckBinary();
	      
	      boolean k=obj.isBinary(str);
         System.out.println(k);
	      //System.out.println(obj.isBinary(str));
	}
}