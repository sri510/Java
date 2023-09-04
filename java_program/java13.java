/*Write a program to find out the cube of a number where number must be taken from command line
argument.*/

package Sep_04;

public class CubeOfNumberCL {
	public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	
		System.out.println("The number:"+n);
		System.out.println("Cube of given number is: "+ (n*n*n));
	}
}
