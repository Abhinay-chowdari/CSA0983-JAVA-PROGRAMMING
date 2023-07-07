import java.util.*;
class reverse
{
public static void main(String args[])
{
int n,rev = 0,rem;
System.out.println("Enter the value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(n !=0)
{
rem = n%10;
rev = rev*10+rem;
n/=10;
}
System.out.println("Reverse of a number:"+rev);
}
}
