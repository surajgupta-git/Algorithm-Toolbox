package week4;
import java.util.*;

public class Inversions {
	    public static long count=0;
    	public static long getNumberOfInversions(int l,int r,int a[]){
    		if(l<r){
    		int m=(int)(l+r)/2;
    		getNumberOfInversions(l,m,a);
    		getNumberOfInversions(m+1,r,a);
    		merge(l,m,r,a);
    		return count;
    		}
			return count;
    	}
    	
    	public static void merge(int l,int m, int r,int a[])
    	{
    		int beg=l;
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
    		} 
    		//logic for num of inversions inside merge procedure (la[p]>ra[q])
    		
    		for(int p=0;p<lasize;p++){
    			for(int q=0;q<rasize;q++){
    			if(la[p]>ra[q])
    			{
    				count++;}}}
    	}
    		

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getNumberOfInversions(0, a.length-1,a));
    }
}

