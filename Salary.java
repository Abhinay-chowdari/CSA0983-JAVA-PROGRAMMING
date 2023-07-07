import java.util.*;
class ded
{
public static void main(String args[])
{
int a;
double ded;
System.out.println("Enter the annual income:");
Scanner S=new Scanner(System.in);
a=S.nextInt();
if(a < 500000)
{
ded=a*0;
System.out.println("Dedection:"+ded);
}
else if(a>500000 && a<750000)
{
ded=a*0.5;
System.out.println("Dedection:"+ded);
}
else if(a>750000 && a<1000000)
{
ded=a*0.1;
System.out.println("Dedection:"+ded);
}
else if(a>1000000 && a<1500000)
{
ded=a*0.12;
System.out.println("Dedection:"+ded);
}
else if(a > 1500000)
{
ded=a*0.2;
System.out.println("Dedection:"+ded);
}
else
{
System.out.println("Invalid input");
}
}
}
