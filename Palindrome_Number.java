import java.util.Scanner;
public class palindrome{
    public static boolean isPalin(int n){
        int t=n;
        int temp=0,r;
        if(n<0)
        return false;
        else
            while(n>0){
                r=n%10;
                temp=temp*10+r;
                n=n/10;
            }
        if(t==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
        if(isPalin(n))
        System.out.println("True");
        else
        System.out.println("False");
        }
    }
}