import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        int count=3;
        System.out.print(a+" "+b+" "+c+" ");
        while(count<n){
            a=b;
            b=c;
            c=a+b;
        System.out.print(c+" ");
        count++;
        }
    }
}