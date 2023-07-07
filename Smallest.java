import java.util.*;
class smallest
{
public static void main(String args[])
{
int a,b,c;
Scanner S=new Scanner(System.in);
System.out.println("Enter the number 1:");
a=S.nextInt();
System.out.println("Enter the number 2:");
b=S.nextInt();
System.out.println("Enter the number 3:");
c=S.nextInt();
if(a<b && a<c)
{
System.out.println(a+" is smallest");
}
else if(b<c)
{
System.out.println(b+" is smallest");
}
else
{
System.out.println(c+" is smallest");
}
}
}
