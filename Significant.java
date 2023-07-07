import java.util.*;
class significant
{
public static void main(String args[])
{
int n,first,last;
System.out.println("Enter the value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
last = n%10;
while(n >= 10)
{
n=n/10;
}
first=n;
System.out.println("First digit:"+first);
System.out.println("Last digit:"+last);
}
}
