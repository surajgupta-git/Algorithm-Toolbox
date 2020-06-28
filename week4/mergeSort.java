package week4;
import java.io.*;
import java.util.*;

public class mergeSort {
	public static int[] mergesort(int l,int r,int a[]){
		if(l<r){
		int m=(int)(l+r)/2;
		mergesort(l,m,a);
		mergesort(m+1,r,a);
		merge(l,m,r,a);
		}
		return a;
	}
	
	public static void merge(int l,int m, int r,int a[])
	{
		int beg=l;
		int end=r;
		int lasize=m-l+1;
		int rasize=r-m;
		int la[]=new int[lasize];
		int ra[]=new int[rasize];
		for(int i=0;i<lasize;++i){la[i]=a[l+i];}
		for(int j=0;j<rasize;++j){ra[j]=a[m+1+j];}
		int i=0,j=0;
		while(i<lasize && j<rasize)
		{
			if(la[i]<=ra[j]){
				a[beg]=la[i];
				
				i++;}
			else{
				a[beg]=ra[j];
				j++;}
			beg++;
		}
		while(i<lasize){
				a[beg]=la[i];
				i++;
			    beg++;
		}
		while(j<rasize){
			a[beg]=ra[j];
			j++;
		    beg++;
	}}
		
	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        a=mergesort(0,n-1,a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
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

	



