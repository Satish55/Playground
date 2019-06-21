import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1 ; 
      for(int cur_row = 1 ; cur_row <= n ; cur_row++)
      {
         for(int space = 1 ; space <= n-cur_row ; space++)
         {
            System.out.print(" ");
         }
         for(int cur_col = 1 ; cur_col <= cur_row ; cur_col++)
         {            
            System.out.print(count + " ");
            count++;
         }
         System.out.print("\n");
      }
    }    
}