/*
Write a program to perform addition,subtraction, multiplication and division between two numbers using 3rd variable.
*/
package Sep_01;

public class MultipalOperatios {
	public static void main(String[] priya) {
		int a=Integer.parseInt(priya[0]);
		int b=Integer.parseInt(priya[1]);
		int c;
		c=a+b;
		System.out.println("Sum= "+ c);
		c=a-b;
		System.out.println("Subtraction "+ c);
		c=a*b;
		System.out.println("Multiplication "+c);
		c=a/b;
		System.out.println("Division "+(float)c);
		long l=Long.parseLong(null);
		float f=Float.parseFloat(null);
		double d=Double.parseDouble(null);
			}
}
