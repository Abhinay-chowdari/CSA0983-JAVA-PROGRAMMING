import java.io.*;
class opr
{
public static void main(String args[])
{
int x=5,y=7,z=10;
x++;
y--;
z=x+y;
y=z--+x;
x=x-(--z);
z+=y;
z-=x;
x+=y;
System.out.println("x:"+x);
System.out.println("\ny:"+y);
System.out.println("\nz:"+z);
}
}
