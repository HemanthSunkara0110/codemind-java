import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int h1=s.nextInt();
        int h2=s.nextInt();
        int temp=0;
        int rem=0;
        for(int i=h1;i<=h2;i++)
        {   if(i<=9)
             {
            if(i%i==0)
            System.out.print(i+" ");
             }
             else
             {
                
              temp=i;
              int f=0;
               while(temp!=0)
               {
                   
               rem=temp%10;
               if(rem==0||i%rem!=0)
             
             {
           
                f++;
             }
                temp=temp/10;
             
               }
               if(f==0)
               System.out.print(i+" ");
             }
             }
        
             
        }
    

}