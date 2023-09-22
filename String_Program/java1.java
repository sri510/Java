/*
Write a Java program to get the character at the given index within the string.
*/

package My_Work;

public class program {
	    
	    	public static void main(String args[])   
	    	{    
	    		char[] arr_num = new char[] { '1', '2', '3', '4' };

	            // Create a String containig the contents of arr_num
	            // starting at index 1 for length 2.
	            String str = String.copyValueOf(arr_num, 1, 3);

	            // Display the results of the new String.
	            System.out.println("\nThe book contains " + str +" pages.\n");
	        }
	    }
