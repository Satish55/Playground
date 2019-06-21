import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int i = 1 ; 
      int factorial = 1 ; 
      for(i = 1 ; i <= num ; i++)
      {
         factorial = factorial * i ;
      }
      System.out.print(factorial);
	}
}