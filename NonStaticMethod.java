class NonStaticMethod{

  int add(int a, int b)
{
  int c=a+b;
  return c;
}
 int sub(int a, int b)
{
int d=a-b;
return d;
}
int multi(int a, int b)
{
int e=a*b;
return e;
}
public static void main(String [] args)
{

  NonStaticMethod m1=new NonStaticMethod();
      int c=m1.add(5,8);
      int
 d=m1.sub(20,10);
      int e=m1.multi(20,2);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);

    
}
}