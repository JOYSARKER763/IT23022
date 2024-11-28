import java.util.Scanner;
public class quise{
public static void main(String args[]){
int count=0;
System.out.println("1)what is the capital of bangladesh");
System.out.println("a)Dhaka");
System.out.println("b)Chittagong");
System.out.println("c)Cumilla");
Scanner input=new Scanner(System.in);
String x=input.nextLine();
if(x.equals("a")){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}

System.out.println("2)what is the melting point of water");
System.out.println("a)100 degree celcius");
System.out.println("b)50 degree celcius");
System.out.println("c)0 degree celcius");
//Scanner input=new Scanner(System.in);
 x=input.nextLine();
if(x.equals("c")){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("3)what is the name of our national fish");
System.out.println("a)Katla");
System.out.println("b)Hilsha");
System.out.println("c)Catfish");

x=input.nextLine();
if(x.equals("b")){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("4)what is our national flug color");
System.out.println("a)Red and white");
System.out.println("b)Red and green");
System.out.println("c)Green and yellow");

x=input.nextLine();
if(x.equals("b")){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("5)what is our mother language");
System.out.println("a)English");
System.out.println("b)Urdu");
System.out.println("c)Bengal");

x=input.nextLine();
if(x.equals("c")){

System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("Score is "+count);
}
}
