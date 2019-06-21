import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in) ;
      int n = in.nextInt();          
      int temp = n ;
      temp = temp / 10 ;
      int count = 1 ;
      while (temp != 0)
      {
         count ++ ;
         temp = temp / 10;
      }
      //System.out.println(count);
      int temp2 = n;      
      int Last_digit = temp2 % 10 ; 
      int count2 = 2;
      int First_digit = 0;
      while (count2 <= count)
      {
         temp2 = temp2 / 10;
         count2++;
      }  
      First_digit = temp2  ; 
      int Result = First_digit + Last_digit;
      System.out.print(Result);
      
	}
}