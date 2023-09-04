/*
 * Write a program to find the sum and average of three numbers where number must be taken from 
 * command line argument.
 */


package Sep_04;

public class SumAndAvgOfThreeNo {
	public static void main(String[] args)
	{
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int sum=0;
		sum=(num1+num2+num3)/3;
		System.out.println("Average of three number is : "+sum);
		}

}
