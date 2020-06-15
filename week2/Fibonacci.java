package week2;
import java.util.Scanner;

public class Fibonacci {

  
  private static long calc_fib(int n) {
    long arr[]=new long[n+2];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<=n;i++)
    {
    arr[i]=arr[i-1]+arr[i-2];
    
    }
    
  
    return (long) arr[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(calc_fib(n));
  }
}