package week3;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
    	int count=0;
    	while(m>=10)
    	{
    		m=m-10;
    		count=count+1;
    	}
    	
    	while(m>=5)
    	{
    		m=m-5;
    		count=count+1;
    	}
    	
    	while(m!=0){
    		m=m-1;
    	    count=count+1;
    	}
    	return count;
    	
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

