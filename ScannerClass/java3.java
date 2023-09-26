/*
Define a method which returns a String containing natural numbers between a given ranges separated by a single space.

Write the method with following specifications

Name of method: getNumbersInRange() // accepts two integer value, return the number between the given range

Arguments: Two arguments of integer type, start_val and end_val

Access Modifier:- public, static

Return Type: A String value

Example:

Inputs: 10 1

Output: 9 8 7 6 5 4 3 2

Inputs: 3 0

Output: 2 1

Inputs: 3 2

Output: -4 // as the difference between 3 and 2 is 1

Specifications: The value returned by the method getNumbersInRange() is determined by the following rules:

If the input values are negative, return "-1" as string

If the input values are equal, return "-2" as string

If the first argument value is less than second argument value, return "-3" as string

If the difference between second argument and first argument is 1, return "-4" as string

In other case return a string with every value separated by single blank space.

Note: Numbers in range must not include start value and end value.
*/
import java.util.Scanner;
class range1{
    public static String getNumbersInRange(int start ,int end){
        
        String s=" ";
             
         if (start <0||end<0)
         {
             return "-1";
         }
        else if(start==end)
         {
             return "-2";
         }
        else if(start<end)
         {
        return "-3";
         }
         else if((start-end)==1)
         {
             return "-4";
         }
         else
         for(int i=start-1;i>end;i--)
             {
                s=s+i+" ";
         }
         return s;
    }
}
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter start value: ");
         int start=sc.nextInt();
          System.out.print("enter end value: ");
        int end=sc.nextInt();
    String s=range1.getNumbersInRange(start,end);
        System.out.println(s);
    }
}
