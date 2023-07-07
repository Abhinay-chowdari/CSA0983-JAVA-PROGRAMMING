import java.util.*;
 class Triangle
 {
 int side1,side2,side3;
 System.out.println("Enter the sides of triangle:");
 Scanner s=new Scanner(System.in);
 side1=s.nextInt();
 side2=s.nextInt();
 side3=s.nextInt();
 void boolean_isRight() {
 if((side1 * side1 + side2 * side2 == side3 * side3) | (side1 *
 side1 + side3 * side3 == side2 * side2) | (side2 * side2 + side3
 * side3 == side1 * side1))
 {
 System.out.println("Right angled triangle");
 }
 else
 {
 System.out.println("Not a Right angled triangle");
 }
};
 void boolean_isScalene() {
 System.out.println("Enter the sides of triangle:");
 Scanner s=new Scanner(System.in);
 side1=s.nextInt();
 side2=s.nextInt();
 side3=s.nextInt();
 if((side1 != side2) && (side1 != side3) && (side2 != side3))
 {
 System.out.println("Scalene triangle");
 }
 else
 {
 System.out.println("Not a Scalene triangle");
 }
 };
 void boolean_isIsosceles() {
 System.out.println("Enter the sides of triangle:");
 Scanner s=new Scanner(System.in);
 side1=s.nextInt();
 side2=s.nextInt();
 side3=s.nextInt();
 if((side1 == side2 && side1 != side3) | (side1 == side3 &&
 side1 != side2) |(side2 == side3 && side2 != side1))
 {
 System.out.println("Isosceles triangle");
 }
 else
 {
 System.out.println("Not an Isosceles triangle");
 }
 };
 void boolean_isEquilateral() {
 System.out.println("Enter the sides of triangle:");
 Scanner s=new Scanner(System.in);
 side1=s.nextInt();
 side2=s.nextInt();
side3=s.nextInt();
 if((side1 == side2) && (side1 == side3))
 {
 System.out.println("Equilateral triangle");
 }
 else
 {
 System.out.println("Not a Equilateral triangle");
 }
 };
 }
 class istriangle
 {
 public static void main(String args[])
 {
 Triangle x=new Triangle();
 x.boolean_isRight();
 x.boolean_isScalene();
 x.boolean_isIsosceles();
 x.boolean_isEquilateral();
 }
 }
