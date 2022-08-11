import java.util.Scanner;
class colorcode
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch;
        ch=s.nextLine().charAt(0);
        if (ch=='V' || ch=='v')
        System.out.println("Violet");
        else if (ch=='I' || ch=='i')
        System.out.println("Indigo");
        else if (ch=='B' || ch=='b')
        System.out.println("Blue");
        else if (ch=='G' || ch=='g')
        System.out.println("Green");
        else if (ch=='Y' || ch=='y')
        System.out.println("Yellow");
        else if (ch=='O' || ch=='o')
        System.out.println("Orange");
        else if (ch=='R' || ch=='r')
        System.out.println("Red");
        else
        System.out.println("-1");
        
    
    }
}