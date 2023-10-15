import java.util.Scanner;
public class isEven{
    public static int isEven(int n){
        if(n%2!=0)
        return 1;
        else
        return 2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
}