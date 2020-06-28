package week3;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class FractionalKnapsack {
	
	public static int getmaxindex(int n,double[] frac){
		double max=frac[0];
		int maxindex=0;
		
		for(int i=0;i<n;i++){
			if(frac[i]>max)
			{
				max=frac[i];
				maxindex=i;
				
			}
			
		}
		
		return maxindex;
	}
    private static double getOptimalValue(int n,int capacity, double[] values, double[] weights) {
        double value = 0;
       double frac[] = new double[n];
       
		
		for(int i=0;i<n;i++){
			frac[i]=values[i]/weights[i];
		}
     
       

        	while(capacity!=0)
        	{
        int maxindex=getmaxindex(n,frac);
        if(frac[maxindex]==0)
        		{
        	return value;
        		}
        if(weights[maxindex]<=capacity){
        			capacity=capacity-(int)weights[maxindex];
        			value=value+values[maxindex];
        		    frac[maxindex]=0;
        }
        else{
        	
			value=value+(frac[maxindex]*capacity);
		    frac[maxindex]=0;
		    
		    capacity=0;
		    break;
        }
        }
        
        
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(n,capacity,values, weights));
    }
} 
