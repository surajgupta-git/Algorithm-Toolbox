package week2;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current)%m;
        }

        return current;
    }
    
    private static long getPisanoPeriod(long m) {
    	// every pisano repetetions start with 0 and 1
        long previous = 0;
        long current = 1;
        long result = 2;
        while (!(previous == 1 && current == 0))
        		{
            long buffer = (previous + current) % m;
            previous = current;
            current = buffer;

            result += 1;
        		}

        return result-1;
        }
    
    private static long getFibonacciHugePisano(long n, long m){
    	return getFibonacciHugeNaive(n%getPisanoPeriod(m), m);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugePisano(n, m));
    }
}



