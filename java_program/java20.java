/*
Define a method which returns a String containing natural numbers between ranges of two numbers separated by a single space.

Write the method with the following specifications:

Name of method: getNumbersInRange()

Access Modifier:- public ,static

Arguments: 2 Arguments of int type 

Return Type: A String value

Values must not be negative. If yes, then return -1 as string.            

 Values must not be same. If yes, then return -2 as string.             

 1st arguments value must not be greater than 2nd arguments value. If yes, then return -3 as string.

Exclude the first and last value and return the result as one string with every value separated by single blank space
*/
import java.util.Scanner;
class range{
    public static String getNumbersInRange(int start,int end){
          String s=" ";
       if(start<0 || end<0)
       
           return "-1";
       
       else if(start==0 || end==0)
       
           return "-2";
       
       else if(start==end)
       s=s+start;
       else
       for(int i=start;i<=end;i++)
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
        System.out.println("enter start value: ");
        int start=sc.nextInt();
         System.out.println("enter end value: ");
        int end=sc.nextInt();
        String s=range.getNumbersInRange(start,end);
        System.out.println(s);
    }
}
