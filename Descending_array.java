import java.util.Scanner;
public class countPalin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
            System.out.print("no");
            System.exit(0);
        }
        }
        System.out.println("yes");
    }
}