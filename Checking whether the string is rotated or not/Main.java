import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner in = new Scanner (System.in) ;
       String str1 = in.nextLine () ;
       String str2 = in.nextLine () ;
       String str = str1.concat(str1) ;
       if(str.contains(str2))
          System.out.print("Yes") ;
       else
          System.out.print("No") ;
    }
}