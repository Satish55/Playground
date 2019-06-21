import java.util.Scanner;
class Main{
    public static int sum_of_numbers(int numb)
    {
       int sum = 0 ;
       for(int i = 1 ; i <= numb ; i++)
       {
          sum = sum + i ;
       }
       return sum ;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum = sum_of_numbers(num) ;
      System.out.print(sum);      
	}
}