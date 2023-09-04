/*
 * Write a program to interchange the value of two numbers without using the third variable where 
 * number must be taken from command line argument.
 */

package Sep_04;

public class InterchangeValueOfTwoNo {
	public static void main(String[] args){
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("Before Interchange: "+num1 + " " + num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Interchange: "+num1 + " " + num2);
		}

}
