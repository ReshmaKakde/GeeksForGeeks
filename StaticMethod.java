class StaticMethod{
   
static int add(int a, int b)
{
int c=a+b;
 return c;
}
static int sub(int a, int b)
{
 int z=a-b;
return z;
} 
 int multi(int a, int b)
{
  int d=a*b;
return d;
}
public static void main(String [] args)
{     
    int x=add(5,10);
    int y=sub(20,10);
   System.out.println(x);
   System.out.println(y);

   StaticMethod obj=new StaticMethod();
       int k= obj.multi(2,4);
     System.out.println(k);
       

}
}
