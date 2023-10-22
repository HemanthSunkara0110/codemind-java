import java.util.Scanner;
public class isPrime{
    public static boolean isPrime(int n){
        if(n<2)return false;
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
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(isPrime(arr[i]))
            count++;
        }
        System.out.println(count);
    }
}