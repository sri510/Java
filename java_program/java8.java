/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
package My_Work;

public class Java8 {
	
	    public static void main(String args[]) {

	        int num = 8; int i;
	        for(i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	        }
	    }
	}
