class Method1{

 static int logic(int a, int b)

{
int z;
if(a>b)
{
z=a+b;
}
else
{
z=(a+b)*2;
} 
return z;
}
public static void main(String [] args)
{
    int c=logic(5,2);
    System.out.println(c);
    System.out.println(logic(5,2));
}
}