import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float f,c;
        Scanner Sc=new Scanner(System.in);
        c=Sc.nextFloat();
        
        f=32+(c*9/5);
        
        System.out.format("%.2f",f);
    }
}
