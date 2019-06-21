import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int Sum_of_Powers = 0 ;       
       int Number_of_digits = 0;
       int Last_digit ;
       for(int temp = n ; temp != 0 ; Number_of_digits++)
       {
          temp = temp / 10 ;         
       }
       //System.out.print(Number_of_digits);
       int temp = n ;
       int Power_of_digit = 1;
       int count = Number_of_digits;
       for( ; count != 0 ; count--)
       {
          Last_digit = temp % 10;          
          for(int i = 0 ; i < Number_of_digits ; i++)
          {
             Power_of_digit = Power_of_digit * Last_digit ; 
          }
          //System.out.print(Power_of_digit);
          //System.out.print("\n");          
          Sum_of_Powers = Sum_of_Powers + Power_of_digit ; 
          Power_of_digit = 1 ;
          temp = temp / 10 ;
       }
       //System.out.print(Sum_of_Powers);
       if(n == Sum_of_Powers)
          System.out.print("Armstrong Number");
       else 
          System.out.print("Not a Armstrong Number");
	}
}