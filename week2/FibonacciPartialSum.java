package week2;
import java.util.*;

public class FibonacciPartialSum {
	
	public static long getFibonacciSumLast(long n) {
        n=n%60; //Pisano period for 10
    	if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n +1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current);
        }

        return (current-1)%10;
    }
	
    private static long getFibonacciPartialSumNaive(long from, long to) {
     
        long sum1 = getFibonacciSumLast(from-1);
        long sum2 = getFibonacciSumLast(to);
        return ((sum2-sum1)+10)%10;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

