import java.util.*;
class simpleintrest
{
public static void main(String args[])
{
int p,t,a;
double si;
System.out.println("Principal Amount:");
Scanner S=new Scanner(System.in);
p=S.nextInt();
System.out.println("Time:");
t=S.nextInt();
System.out.println("Enter the customer age:");
a=S.nextInt();
if(a > 60)
{
si=(p*t*0.10)/100;
System.out.println("Simple Intrest="+si);
}
else
{
si=(p*t*0.12)/100;
System.out.println("Simple Intrest="+si);
}
}
}
