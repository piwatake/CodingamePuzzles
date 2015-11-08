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
	    
	    
	    int max = Integer.parseInt(myarr[0]);
	    int min = Integer.parseInt(myarr[0]);
	    int maxpos = 0;
	    int minpos = 0;
	    int offset = 0;
	    //main work loop
	        
	        for(int i = 0 ; i<n-offset;i++){
    	        int curr = Integer.parseInt(myarr[i]);
    	        
    	        if(curr>max){
    	            max = curr;
    	            maxpos = i;
    	        }
    	        
    	        if(curr<min){
    	            min = curr;
    	            minpos = i;
    	        }
    	        
    	        if(i>0){
    	            if(Integer.parseInt(myarr[i]) > Integer.parseInt(myarr[i-1])){
    	                incr++;
    	            } else if (Integer.parseInt(myarr[i]) < Integer.parseInt(myarr[i-1])){
    	                decr++;
    	            } 
    	        }
    	        System.err.println(myarr[i]);
    	    }
    	    
    	    
    	    int maxfrontofmin = 0;
    	    for(int j = minpos ; j>=0 ;j-- ){
    	        int curr = Integer.parseInt(myarr[j]);
    	        if(curr > maxfrontofmin){
    	            maxfrontofmin = curr;
    	        }
    	        
    	        
    	    }
    	    
    	    System.err.println("maxfrontof min is "+maxfrontofmin+" and diff is "+(min-maxfrontofmin));
    	    

    	    
	    
	    System.err.println("Maxpos is "+maxpos+" and min pos is "+minpos);
	    
	    
	    
	    
	    //begin printing out answers.
	    
	    //System.err.println(incr+" "+decr);
	    
	    if((incr > 0 && decr == 0 ) || incr == 0 && decr == 0){
	        System.out.println("0");
	    } else if (decr > 0 && incr == 0){
	        System.out.println(Integer.parseInt(myarr[1]) - Integer.parseInt(myarr[0]));
	    } else {/*
	        int offset = 0;
            while(maxpos > minpos){
                System.err.println("Maxpos is "+maxpos+" and min pos is "+minpos);
                offset++;
    	        System.err.println("We try again.");
    	        //ArrayList<Integer> deny = new ArrayList<Integer>();
    	        
    	        //deny.add(maxpos);
    	        //System.err.println("spot "+maxpos+" is no longer valid.");
    	        
    	        
    	        max = Integer.parseInt(myarr[0]);
        	    min = Integer.parseInt(myarr[0]);
        	    maxpos = 0;
        	    minpos = 0;
            	        
    	        for(int i = 0 ; i<n-offset;i++){
        	        int curr = Integer.parseInt(myarr[i]);
        	        
        	        if(curr>max ){//&& !deny.contains(maxpos)
        	            max = curr;
        	            maxpos = i;
        	        }
        	        
        	        if(curr<min){
        	            min = curr;
        	            minpos = i;
        	        }
        	        
        	        if(i>0){
        	            if(Integer.parseInt(myarr[i]) > Integer.parseInt(myarr[i-1])){
        	                incr++;
        	            } else if (Integer.parseInt(myarr[i]) < Integer.parseInt(myarr[i-1])){
        	                decr++;
        	            } 
        	        }
        	        System.err.println(myarr[i]);
        	    }*/
    	        
    	        System.err.println("problem.");
    	        System.out.println((min-maxfrontofmin));
    	    //}
	    }
	    

        
        
        
        //System.out.println(vs);

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}