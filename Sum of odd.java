import java.util.*;
class oddsum
{
public static void main(String args[])
{
int n,i=1,sum=0;
System.out.println("Enter n value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
do
{
sum+=i;
i+=2;
}
while(i<=n);
System.out.println("Sum of series is:"+sum);
}
}
