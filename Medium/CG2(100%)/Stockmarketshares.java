import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String vs = in.nextLine();
        
        
        InputStream is = new ByteArrayInputStream(vs.getBytes());

	    // read it with BufferedReader
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    
	    String[] myarr = new String[n];
	    
	    try{
            myarr = br.readLine().split(" ");
        }catch(IOException ioe){
            System.err.println("IO error.");
        }
        
        

	    int incr = 0;
	    int decr = 0;

	    //main work loop
	    
	    int[] diffs = new int[n-1];
	    int[] maxloss = new int[n-1];
	        
        for(int i = 0; i<n-1;i++){
	        int curr = Integer.parseInt(myarr[i+1]);
	        int prev = Integer.parseInt(myarr[i]);
	        
	        if(curr>=prev){
	            incr++;
	        } else if (curr<prev){
	            decr++;
	        }
	        diffs[i] = curr - prev;
	        
	        

	        System.err.println("diffs: "+diffs[i]+" at "+(i));
	    }
	    
	    maxloss[0] = diffs[0];
	    for(int i = 1; i<n-1;i++){
	        
	        int add = maxloss[i-1] + diffs[i];
	        
	        if(diffs[i] < add){
	            maxloss[i] = diffs[i];
	        } else {
	            maxloss[i] = add;
	        }
	        
	        
	        

	        System.err.println(maxloss[i]);
	    }
	    
	    int min = maxloss[0];
	    for(int j = 1; j< maxloss.length;j++){
	        if(maxloss[j] < min){
	            min = maxloss[j];
	        }
	    }
	    
	    
	    if(incr>0&&decr == 0){
	        System.out.println(0);
	    } else {
	        System.out.println(min);
	    }
	    
	    
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}