package week2;
import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
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
	  return ((long)a*b/dividend) ;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
