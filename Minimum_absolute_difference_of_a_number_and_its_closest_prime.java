import java.util.Scanner;
class Main
{
    static boolean isPrime(int N)
    {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
    static int getDifference(int N)
    {
        if (N == 0)
            return 2;
        else if (N == 1)
            return 1;
        else if (isPrime(N))
            return 0;
        int aboveN = -1, belowN = -1;
        int n1;
        n1 = N + 1;
        while (true) {
            if (isPrime(n1)) {
                aboveN = n1;
                break;
            }
            else
                n1++;
        }
        n1 = N - 1;
        while (true) {
            if (isPrime(n1)) {
                belowN = n1;
                break;
            }
            else
                n1--;
        }
        int diff1 = aboveN - N;
        int diff2 = N - belowN;
 
        return Math.min(diff1, diff2);
    }
    public static void main(String args[])
    {
        int N;
        Scanner Sc=new Scanner(System.in);
        N=Sc.nextInt();
        System.out.println(getDifference(N));
    }
}