import java.util.*;
class triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
float s,Area;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s=(float)(a+b+c)/2;
Area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.format("%.2f",Area);
}
}