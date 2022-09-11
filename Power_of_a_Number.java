import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int m=s.nextInt();
        int r=(int)Math.pow(x,y)%m;
        System.out.print(r);
    }
}