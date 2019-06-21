import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int factor = 1 ; 
      for(factor = 1 ; factor <= n ; factor++)
      {
         if (n % factor == 0)
         {
            System.out.print(factor);
            System.out.print("\n");
         }
      }
	}
}