import java.util.Scanner;
class circle
{
public static void main(String args[])
{
int r;
double a,c;
System.out.println("Radius:");
Scanner S=new Scanner(System.in);
r=S.nextInt();
a=3.14*r*r;
System.out.println("Area of the Circle:"+a);
c=2*3.14*r;
System.out.println("Circumference of the Circle:"+c);
}
}
