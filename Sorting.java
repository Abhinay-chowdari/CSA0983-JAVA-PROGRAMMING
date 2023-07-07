import java.util.*;
class sort
{
int i,j,n,temp;
void sorting()
{
System.out.println("Enter n value:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int x[]=new int[n];
System.out.println("Enter the values:");
for(i=0;i<n;i++)
{
x[i]=s.nextInt();
}
System.out.println("Array values before sorting:");
for(i=0;i<n;i++)
{
System.out.print(x[i]+" ");
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(x[i] > x[j])
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
System.out.println("Array values after sorting:");
for(i=0;i<n;i++)
{
System.out.print(x[i]+" ");
}
};
}
class arrange
{
public static void main(String args[])
{
sort x=new sort();
x.sorting();
}
}
