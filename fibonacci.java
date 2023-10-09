import java.util.Scanner;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,count=3;
        n=sc.nextInt();
        c=a+b;
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