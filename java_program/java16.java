/* 
 *  Write a program to input the basic salary of a person. He get 15% of the basic as HRA, 15% of the
 *  basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is
 *  calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the
 *  total salary of person.
 *  Take the Basic Salary from Command Line Argument
 */
package Sep_05;

public class Codehs_Program_4 {
	public static void main(String args[]){
		
		int sal=Integer.parseInt(args[0]);
		double hra;
		double c;
		double ea;
		double t_sal;
		
		hra=0.15*sal;
		c=0.15*sal;
		ea=0.1*sal;
		t_sal=hra+c+ea+sal;
		
	    System.out.println("Basic Salary : "+sal);
	    System.out.println("HRA : "+hra);
	    System.out.println("Conveyance : "+c);
	    System.out.println("Entertainment Allowance : "+ea);
	    System.out.println("ToTal Salary : "+t_sal);
	    
}
}
