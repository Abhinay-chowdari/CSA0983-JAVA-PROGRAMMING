import java.util.*;
class oddarr
{
public static void main(String args[])
{
int i,n;
System.out.println("Enter n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int x[]=new int[n];
System.out.println("Enter elements:");
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
}
System.out.println("Odd numbers in the given array:");
for(i=0;i<n;i++)
{
if(x[i]%2!=0)
{
System.out.println(x[i]);
}
}
}
}
