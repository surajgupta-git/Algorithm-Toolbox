package week3;
import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int children=1;
        int j=1;
        int index=0;
        int k;
        
        
        while(n!=0){
        	if(children==1){
        summands.add(index,j);
        children++;
        n=n-j;
        index++;
        }
        	
        if(n>j){
        k=++j;
        summands.add(index,k);
        children++;
        n=n-k;
        index++;
        }
        else{
        summands.set(index-1,n+j);
        n=n-j;	
        break;
        }
        }
        //write your code here
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

