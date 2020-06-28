package week3;
import java.util.*;
//import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int n,int[] stops) {
    	int numrefills=0;
    	int track=0;
    	int max=0;
    	int i=0;
    	int current=0;
    	if(stops[0]>tank)
    	{
    		return -1;
    	}
    	if(dist-stops[n-1]>tank)
    	{
    		return -1;
    	}
    	for(i=1;i<n;i++)
    	{
    		if(stops[i]-stops[i-1]>tank)
    		{
    			return -1;
    		}
    	}
    	    i=0;
    	while(current<=dist){
    		while( i<n){
    			while(stops[i]<=(track+tank)){
    			if(stops[i]>max)
    			{
    				max=stops[i];
    			}
    			i++;
    			if(i==n){break;}
    			}
    			current=max;
    			numrefills=numrefills+1;
    			track=max;
    			}
    		return numrefills;	
    		}
    		return numrefills;
    }
    			
    	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, n,stops));
    }
}
