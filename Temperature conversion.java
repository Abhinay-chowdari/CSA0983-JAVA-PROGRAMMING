import java.util.Scanner;
class temp
{
public static void main(String args[])
{
float c,f;
System.out.println("Enter the temperature in fahrenheit:");
Scanner S=new Scanner(System.in);
f=S.nextFloat();
c=(5*(f-32))/9;
System.out.println("Enter the temperature in Celsius:"+c);
}
}
