
import java.util.Scanner;
public class cgpa{
public static void main(String[] args){
System.out.println("enter your student id:");
Scanner sc=new Scanner(System.in);
String ID=sc.nextLine();
System.out.println("Congratulation ID= "+ID);
System.out.println("enter your course (c1) details:");
System.out.println("enter your course credit:");
int cr1=sc.nextInt();
System.out.println("enter your ct marks:");
int ct=sc.nextInt();
System.out.println("enter your attendence marks:");
int at=sc.nextInt();
System.out.println("enter your semester final marks:");
int fi=sc.nextInt();
int total1=ct+at+fi;
double c1;
if(total1>=80)
c1=4.00;
else if(total1>=75&&total1<80)
c1=3.75;
else if(total1>=70&&total1<75)
c1=3.50;
else if(total1>=65&&total1<70)
c1=3.25;
else if(total1>=60&&total1<65)
c1=3.00;
else if(total1>=55&&total1<60)
c1=2.50;
else if(total1>=50&&total1<55)
c1=2.25;
else if(total1>=45&&total1<50)
c1=2.25;
else if(total1>=40&&total1<45)
c1=2.00;
else
c1=0.00;




System.out.println("enter your course (c2) details:");
System.out.println("enter your course credit:");
int cr2=sc.nextInt();
System.out.println("enter your ct marks:");
ct=sc.nextInt();
System.out.println("enter your attendence marks:");
 at=sc.nextInt();
System.out.println("enter your semester final marks:");
fi=sc.nextInt();
int total2=ct+at+fi;
double c2;
if(total2>=80)
c2=4.00;
else if(total2>=75&&total2<80)
c2=3.75;
else if(total2>=70&&total2<75)
c2=3.50;
else if(total2>=65&&total2<70)
c2=3.25;
else if(total2>=60&&total2<65)
c2=3.00;
else if(total2>=55&&total2<60)
c2=2.50;
else if(total2>=50&&total2<55)
c2=2.25;
else if(total2>=45&&total2<50)
c2=2.25;
else if(total2>=40&&total2<45)
c2=2.00;
else
c2=0.00;






System.out.println("enter your course (c3) details:");
System.out.println("enter your course credit:");
int cr3=sc.nextInt();
System.out.println("enter your ct marks:");
 ct=sc.nextInt();
System.out.println("enter your attendence marks:");
at=sc.nextInt();
System.out.println("enter your semester final marks:");
fi=sc.nextInt();
int total3=ct+at+fi;
double c3;
if(total3>=80)
c3=4.00;
else if(total3>=75&&total3<80)
c3=3.75;
else if(total3>=70&&total3<75)
c3=3.50;
else if(total3>=65&&total3<70)
c3=3.25;
else if(total3>=60&&total3<65)
c3=3.00;
else if(total3>=55&&total3<60)
c3=2.50;
else if(total3>=50&&total3<55)
c3=2.25;
else if(total3>=45&&total3<50)
c3=2.25;
else if(total3>=40&&total3<45)
c3=2.00;
else
c3=0.00;
double cgpa=(c1*cr1+c2*cr2+c3*cr3)/(cr1+cr2+cr3);
System.out.println("total credit= "+(cr1+cr2+cr3));
System.out.println("your CGPA= "+cgpa);
}
}
