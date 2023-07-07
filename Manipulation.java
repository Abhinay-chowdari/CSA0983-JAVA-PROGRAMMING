import java.util.*;
class manipulation
{
public static void main(String args[])
{
int i,j,k,choice,sum=0;
Scanner S=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int add[][]=new int[3][3];
int sub[][]=new int[3][3];
int mul[][]=new int[3][3];
System.out.println("Matrix 1:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=S.nextInt();
}
System.out.println();
}
System.out.println("Matrix 2:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=S.nextInt();
}
System.out.println();
}
System.out.println("Enter your choice:");
choice=S.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Matrix Addition:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
add[i][j]=a[i][j]+b[i][j];
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(add[i][j]+" ");
}
System.out.println();
}
break;
}
case 2:
{
System.out.println("Matrix Subraction:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
sub[i][j]=a[i][j]-b[i][j];
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(sub[i][j]+" ");
}
System.out.println();
}
break;
}
case 3:
{
System.out.println("Matrix Multiplication:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
mul[i][j]=0;
for(k=0;k<3;k++)
{
mul[i][j]+=(a[i][k]*b[k][j]);
}
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
break;
}
case 4:
{
System.out.println("Transpose of a matrix A:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println();
}
System.out.println("Transpose of a matrix B:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[j][i]+" ");
}
System.out.println();
}
break;
}
case 5:
{
System.out.println("Sum of diagonal elements in matrix A:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
sum+=a[i][j];
}
}
}
System.out.println(sum);
break;
}
default:
{
System.out.println("Invalid");
break;
}
}
}
}
