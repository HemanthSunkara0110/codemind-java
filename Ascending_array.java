import java.util.*;
public class AscendArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
            System.out.println("no");
            
            System.exit(0);
        }
        }
        System.out.println("yes");
    }
}
