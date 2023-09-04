/*
 * Write a program to calculate the tax for a taxable income of Rs. 9,90,000, if the tax rate is fixed
 *  at 4.9%.
 */

package Sep_04;

public class CalTaxForaTaxableIncome {
    public static void main(String[] args){
		
		float tax;
		int income=Integer.parseInt(args[0]);
		double rate=Double.parseDouble(args[1]);
		
		System.out.println("The Income is Rs.: "+income);
		System.out.println("The Rate is : "+rate);
		
		tax=(float)((income*rate)/100);
		
		System.out.println("The Tax is : "+tax);
		}
}
