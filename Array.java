import java.util.*;
class array
{
public static void main(String args[])
{
int i;
int x[] = new int[5];
Scanner S=new Scanner(System.in);
for(i=0;i<5;i++)
{
x[i]=S.nextInt();
}
System.out.println("Array values:");
for(i=0;i<5;i++)
{
System.out.print(x[i]+"\t");
}
}
}
