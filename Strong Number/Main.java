import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int temp = num ; 
       int Sum_of_factorials = 0 ;
       int Factorial_of_Lastdigit = 1 ;
       int temp2 ;
       int Last_digit;
       for( ; temp != 0 ; )
       {
          Last_digit = temp % 10 ; 
          temp2 = Last_digit ;
          for(int i = 0 ; i < Last_digit ; i++ , temp2--)
          {
             Factorial_of_Lastdigit = Factorial_of_Lastdigit * temp2;
          }
          Sum_of_factorials = Sum_of_factorials + Factorial_of_Lastdigit ;
          Factorial_of_Lastdigit = 1 ; 
          temp = temp / 10 ;
       }
       if(num == Sum_of_factorials)
          System.out.print("Yes");
       else 
          System.out.print("No");
	}
}