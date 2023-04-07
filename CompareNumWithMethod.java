class CompareNumWithMethod{
    static  String compareNM(int n,int m){
        
    
        if(n<m)
        {
            System.out.println("lesser");
    } 
    else if(n>m)
       {
           System.out.println("greater");
       
       }  
       else
       {
           System.out.println("equal");
       }
           return "";
       
     }
    public static void main(String [] args)
    {
        compareNM(10,8);
    
    }
}