import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in) ;
      String str = in.nextLine() ;
      //System.out.print(str) ;
      int isPalindrome = 1 ;
      for(int i = 0, j = str.length() - 1 ; i < j ; i++, j--)
      {
         if(str.charAt(i) != str.charAt(j))
         {
            isPalindrome = 0 ;
            break ;
         }
      }
      if(isPalindrome == 1)
         System.out.print("Yes") ;
      else
         System.out.print("No") ;
    } 
}