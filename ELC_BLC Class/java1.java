/*
Define a method which returns a String containing natural numbers between a range of two numbers separated by a single space. Solve it without using loops.

Write the method with the following specifications:

Name of method: getNaturalNumbers()

Access Modifier: public , static

Arguments: 2 Arguments of int type. 

Return Type: A String value

Values must not be negative. If yes, then return -1 as string.                 

Values must not be 0. If yes, then return -2 as string. 

Natural Numbers must be returned as one string with every value separated by single blank space.

Consider that, the first argument value is less than the second argument number
*/
import java.util.Scanner;
class natural{
    public static String getNaturalNumbers(int start,int end){
        String s="";
		if(start<0 || end<0)
			return "-1";
		else if(start==0 || end==0)
			return "-2";
		else
		{
			if(start==end)
				s=s+start;
			else
				s=start+" "+ getNaturalNumbers(start+1, end);
		}
		return s;
        
    }
}

public class MyProgram
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int n2=sc.nextInt();
		String s=natural.getNaturalNumbers(n1, n2);
		System.out.println(s);
    }
}
