class PalinDromeArray
{
	public static int palinArray(int[] a, int n)
           {
                  for(int i=0;i<n;i++)
                  {
                      
                  String number=String.valueOf(a);
      
                  int j=number.length()-1;
                  while(i<j)
                  {
                      if(number.charAt(i)!=number.charAt(j))
                      return 0;
                  }
                    
                  } 
                  return 1;
           }
public static void main(String [] args)
{
   int[] a={111,222,333,444,555};
    int n=a.length;

    System.out.println(palinArray(a,n-1));
}
}