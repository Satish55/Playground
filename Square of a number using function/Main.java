import java.util.Scanner;
class Main
{
    public static int square_of_number(int numb)
    {
       int square_numb = numb * numb ;    
       return square_numb ;
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int square = square_of_number(num);
      System.out.print(square);     
	} 
}