import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i:arr){
            System.out.printf("%d ",i);
        }
        
        
    }
}