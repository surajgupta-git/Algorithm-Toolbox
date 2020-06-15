package week1;
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
         int max1index=0;
         int max2index=-1;
         long n = numbers.length;
            for (int i=0;i<n;i++)
            {
                if(numbers[i]>numbers[max1index])
                {
                  max1index=i;
                }
            }
            for(int i=0;i<n;i++)
            {
                if((i!=max1index) && (max2index==-1 ||numbers[i]>numbers[max2index]))
                {
                    max2index=i;
                }
            }
            return (long)numbers[max1index]*numbers[max2index];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
