package week2;
import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;
        long previous = 0;
        long current  = 1;
        long sum      = 1;
        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }
        return sum % 10;
    }
    
    private static long getFibonacciSumSquaresFast(long n)
    {
    n=n%60;
    long arr[]=new long[(int)n+2];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<=n+1;i++)
    {
    arr[i]=(arr[i-1]+arr[i-2])%10;
    }
    return (arr[(int)n]*arr[(int)n+1])%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresFast(n);
        System.out.println(s);
    }
}

