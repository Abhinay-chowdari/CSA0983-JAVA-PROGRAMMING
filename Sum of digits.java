import java.util.*;
class digitsum
{
public static void main(String args[])
{
int n,sum=0,num;
System.out.println("Enter the value:");
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(n > 0)
{
num=n%10;
sum+=num;
n=n/10;
}
System.out.println("Sum of digits:"+sum);
}
}
