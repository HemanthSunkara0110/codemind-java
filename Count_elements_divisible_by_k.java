import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int i,count=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]%k==0)
            count++;
        }
        System.out.println(count);
    }
}