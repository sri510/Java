/*
Input = a=23 b=49 c=79
Output =  30+50+80=160
*/
public class Set_B_Program_1 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum=0;
		
		System.out.println(" a="+a+ " b="+b+ " c="+c);
		int x=(a+(10-a%10));
		int y=(b+(10-b%10));
		int z=(c+(10-c%10));
		sum=x+y+z;
		System.out.println(" x="+x+ " y="+y+ " z="+z);
		System.out.println(sum);
				
	}
}
