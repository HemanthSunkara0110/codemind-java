import java.util.Scanner;
public class CloPalin{
    public static boolean isPalindrome(int n){
        int r,temp=0,t=n;
        while(n>0){
            r=n%10;
            temp = temp*10+r;
            n=n/10;
        }
        if(temp==t)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1=0,c2=0;
        for(int i=n-1;i>=0;i--){
            if(isPalindrome(i)){
                c1=i;
            break;
            } 
        }
        for(int i=n+1;i>=0;i++){
            if(isPalindrome(i)){
                c2=i;
                break;
            }
        }
        if(n-c1 > c2-n)
        System.out.println(c2);
        else if(n-c1 < c2-n)
        System.out.println(c1);
        else
        System.out.println(c1+" "+c2);
    }
}