import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int cur_col = 1 ; cur_col <= n ; cur_col++)
        System.out.print("*");
      System.out.print("\n");
      for(int cur_row = 1 ; cur_row <= n-2 ; cur_row++)
      {
         for(int cur_col = 1 ; cur_col <= n ; cur_col++)
         {
            if( (cur_col == 1) || (cur_col == n) )
               System.out.print("*");
            else
               System.out.print(" ");
         }
         System.out.print("\n");
      }
      for(int cur_col = 1 ; cur_col <= n ; cur_col++)
        System.out.print("*");
	}
}