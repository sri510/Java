/*
Write a Java program to print the current date and time in the specified format.
  */

package My_Work;
import java.util.Calendar;
public class program {
	    
	    	public static void main(String args[])   
	    	{
	    		Calendar c = Calendar.getInstance();
	    	      System.out.println("Current Date and Time :"); 
	    	      System.out.format("%tB %te, %tY%n", c, c, c);
	    	      System.out.format("%tl:%tM %tp%n", c, c, c); 
	    	  
	    	}
	    	}
