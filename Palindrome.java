import java.util.Scanner;
class Palindrome
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
int rev=0;
int r=0;
int temp=no;
while(no>0)
{
r=no%10;
rev=(rev*10)+r;
no=no/10;
}
if(temp==rev)
System.out.println("The given number is Palindrome number");
else
System.out.println("the given number is not a palindrome number");
}
}