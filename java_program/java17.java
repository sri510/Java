/*
Write a program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable
puffs (@ Rs 25 per vegetable puffs). There is a special Yoga Day discount of Rs 50 on the final bill amount. Calculate and print final bill as well
as all item bill.
*/
public class MyProgram
{
    public static void main(String[] args)
    {
        int q_c=4;
        int q_v=3;
        
        int r_c=60;
        int r_v=25;
        
        int total_q_c=q_c*r_c;
        int total_q_v=q_v*r_v;
        
        System.out.println("Dominos");
        System.out.println("Chicken rolls: 4 X 60 :" + total_q_c);
        System.out.println("vegetable puffs:  3 X 25 :" + total_q_v);
        
        int total_bill=total_q_c+total_q_v;
        
        System.out.println("Final bill amount : " + total_bill);
    }
}
