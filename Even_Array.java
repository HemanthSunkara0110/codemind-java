import java.util.*;
public class evenarr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=n;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
            if(arr[i]>=0 && arr[i]%2==0)
            count--;
        }
        if(count==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}