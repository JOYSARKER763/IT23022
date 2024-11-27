import java.util.Scanner;
//import java.lang.Math;
public class area{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double radius=sc.nextDouble();
double area=Math.PI*radius*radius;
System.out.println("The area of radius "+radius+" is "+area);
}
}
