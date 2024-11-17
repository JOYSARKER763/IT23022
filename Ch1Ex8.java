public class Ch1Ex8{
public static void main(String args[]){
int i;
double sum=1;
double sum1;
int j=1;
for(i=3;i<=1000;i=i+2)
{
sum=sum+(Math.pow(-1,j)*(1.0/i));
j++;
}
sum1=4*sum;
System.out.println(sum1);
}
}
