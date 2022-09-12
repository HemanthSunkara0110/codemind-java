import java.util.*;
class add
{
    public static int Isadd(int num){
        int cou=0;
        while(num>0){
            cou=cou+num%10;
            num/=10;
        }
        if(cou>9){
            Isadd(cou);
        }
        else{
            System.out.println(cou);
        }
        return cou;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Isadd(num);
    }
}