import java.util.Scanner;
public class quise{
public static void main(String args[]){
int count=0;
System.out.println("what is the capital of bangladesh");
System.out.println("1)Dhaka");
System.out.println("2)Chittagong");
System.out.println("3)Cumilla");
Scanner input=new Scanner(System.in);
int x=input.nextInt();
if(x==1){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}

System.out.println("what is the melting point of water");
System.out.println("1)100 degree celcius");
System.out.println("2)50 degree celcius");
System.out.println("3)0 degree celcius");
//Scanner input=new Scanner(System.in);
 x=input.nextInt();
if(x==3){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("what is the name of our national fish");
System.out.println("1)Katla");
System.out.println("2)Hilsha");
System.out.println("3)Catfish");

x=input.nextInt();
if(x==2){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("what is our national flug color");
System.out.println("1)Red and white");
System.out.println("2)Red and green");
System.out.println("3)Green and yellow");

x=input.nextInt();
if(x==2){
System.out.println("Correct");
count+=5;
}
else
{
System.out.println("Wrong");
count-=1;
}
System.out.println("what is our mother language");
System.out.println("1)English");
System.out.println("2)Urdu");
System.out.println("3)Bengal");

x=input.nextInt();
if(x==3){

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
