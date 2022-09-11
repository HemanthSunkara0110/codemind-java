import java.util.*;
class Sample
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
          String s2=s.nextLine();
          int n=s.nextInt();
          double bill=0;
          double total=0;
        
          if(n<=199)
          bill=(n*1.20);
          else if(n>=200&&n<400)
           bill=(n*1.50);
            else if(n>=400&&n<600)
           bill=(n*1.80);
           else
           bill=(n*2.00);
            double  netbill=0;
             if(bill>400)
             netbill=bill*(15/100.0);
             if(netbill>100)
             total=bill+netbill;
             else
                 total=bill+netbill+100;
                 System.out.printf("%.2f",total);
             
           
    }
}