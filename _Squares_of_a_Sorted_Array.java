import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        System.out.printf("%d ",arr[i]);
    }
    
}