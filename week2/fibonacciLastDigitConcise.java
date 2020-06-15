package week2;
import java.util.Scanner;

public class fibonacciLastDigitConcise {
	
		  private static long calc_fibLastDigit(long n, long m) {
		    long arr[]=new long[(int)n+2];
		    long period=m;
		    arr[0]=0;
		    arr[1]=1;
		    for(int i=2;i<=n;i++)
		    {
		    arr[i]=(arr[i-1]+arr[i-2])%m;
		    if(arr[i]==0 & arr[i-1]==1){
		    	period=(long)i;
		    	break;
		    }
		    }
		    return arr[(int)(n%period)];
		  }

		  public static void main(String args[]) {
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    long m = in.nextInt();
		    System.out.println(calc_fibLastDigit(n,m));
		  }
		}
