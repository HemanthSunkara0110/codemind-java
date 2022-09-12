import java.util.*;
class ganesh{
    public static boolean IsPrime(int num){
        int cou=0;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                cou+=1;
            }
        }
        if(cou==0){
            return true;
        }
        else
        return false;
    }
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num,num1,cou=0;
		num=sc.nextInt();
		num1=sc.nextInt();
		for(int i=num;i<=num1;i++){
		    if(IsPrime(i)==true){
		        if(i>1){
		        System.out.println(i);
		        }
		    }
		}
    }
}