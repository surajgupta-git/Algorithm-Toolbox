package week4;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int l, int r) {
        if (l == r) 
            return -1;
        if (l + 1 == r) 
            return a[l];
        int mid = (int)((l + r-1)/2);
        int right_elem=getMajorityElement(a, mid+1,r);
        int left_elem=getMajorityElement( a, l, mid+1);
        int lcount = 0,rcount = 0;
        for (int i = l; i < r; i++) {
            if (a[i] == left_elem)
                lcount++;}
        for (int i = l; i < r; i++) {
            if (a[i] == right_elem)
                rcount++;}
        if (lcount > (r-l) / 2)
            return left_elem;
        if (rcount > (r-l) / 2)
            return right_elem;
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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

