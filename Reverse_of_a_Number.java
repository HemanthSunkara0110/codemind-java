import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,temp=0;
        while(n>0){
            r=n%10;
            temp = temp*10+r;
            n=n/10;
        }
        System.out.println(temp);
    }
}