/*
Write a program to perform addition using command line Argument.
*/
package Sep_01;

public class AdditionUsingCommandLines {
	public static void main(String[]args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int d=Integer.parseInt(args[2]);
		int c=a+b+d;
		System.out.println(" a="+a+ " b="+b+ " d="+d+ " c="+c);
		System.out.println(args[0] + args[1] + args[2]);
		
	}

}
