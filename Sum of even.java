import java.util.*;
class evensum
{
public static void main(String args[])
{
int n,i=0,sum=0;
System.out.println("Enter n value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(i<n)
{
i+=2;
sum+=i;
}
System.out.println("Sum of series is:"+sum);
}
}
