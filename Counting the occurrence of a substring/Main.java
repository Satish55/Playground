import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in) ;
    String str = in.nextLine() ;
    String substr = in.nextLine() ;
    //System.out.print(substr) ;
    int count = 0 ; 
    int ssl = substr.length() ;
    for(int i = 0 ; i < str.length() - ssl + 1 ; i++) 
    {
       if(substr.charAt(0) == str.charAt(i))
       {          
          String str2 = str.substring(i, i + ssl) ;
          count ++ ;
          //System.out.println(str2) ;
       }
    }
    System.out.print(count) ;
  } 
}