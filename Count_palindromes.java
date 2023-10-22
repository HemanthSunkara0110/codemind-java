import java.util.Scanner;
public class countPalin{
    public static boolean isPalin(int n){
        int temp=0,t=n,r;
        while(n>0){
            r=n%10;
            temp=temp*10+r;
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
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(isPalin(arr[i]))
            count++;
        }
        System.out.println(count);
    }
}