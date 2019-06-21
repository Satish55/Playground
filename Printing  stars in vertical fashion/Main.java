import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int Number_of_stars = in.nextInt();
    for(int i = 1 ; i <= Number_of_stars ; i++)
    {
       System.out.println("*");
    }
  }
}