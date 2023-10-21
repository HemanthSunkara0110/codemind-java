import java.util.Scanner;
public class main{
    public static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        if(a==1)
        a=2;
        for(int i=a;i<=b;i++){
            if(isPrime(i))
            count++;
        }
        System.out.println(count);
    }
}