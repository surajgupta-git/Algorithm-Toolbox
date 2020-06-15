package week2;
import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int reminder=1;
    int dividend=a;
    int divisor=b;
    if(b>a){
    	dividend=b;
    	 divisor=a;
    }
   while(reminder!=0){
	   
    reminder=dividend%divisor;
    dividend=divisor;
    divisor=reminder;
  }
   return dividend;

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
