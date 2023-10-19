/*
Write a program to find out the area of circle by taking the value from Command line arguments.
*/
package Sep_01;

public class FinfOutTheAreaOfCircleUsingCommandLines {
	public static void main(String[] priya) {
		float r=Float.parseFloat(priya[0]);
		double a=3.14*r*r;
		System.out.println("Area of Circle = "+a);
	}
}
