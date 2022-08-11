import java.util.Scanner;
class colorcode
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch;
        ch=s.nextLine().charAt(0);
        if (ch=='A' || ch=='a')
        System.out.println("Vowel");
        else if (ch=='E' || ch=='e')
        System.out.println("Vowel");
        else if (ch=='I' || ch=='i')
        System.out.println("Vowel");
        else if (ch=='O' || ch=='o')
        System.out.println("Vowel");
        else if (ch=='U' || ch=='u')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
        
    
    }
}