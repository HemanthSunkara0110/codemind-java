import java.util.*;
public class main{
    public static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
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
        int t=sc.nextInt();
        int g=0,l=0;
        while(t-->0){
            int n=sc.nextInt();
            for(int i=n;;i++){
                if(isPrime(i)){
                g=i;
                break;
                }
            }
            for(int i=n;i>=0;i--){
                if(isPrime(i)){
                l=i;
                break;
                }
            }
        if((g-n) < (n-l))
        System.out.println(g);
        else if((n-l)==(g-n))
        System.out.println(l);
        else
        System.out.println(l);
        }
    }
}