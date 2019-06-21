import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner (System.in) ;
    String str = in.nextLine() ;
    //System.out.println(str) ;
    char ch ;
    StringBuilder sb = new StringBuilder ("") ;
    for(int i = 0 ; i < str.length() ; i++) 
    {
       ch = str.charAt(i) ;
       if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
       {
          sb.append(ch) ;
       }
    }
    System.out.println(sb) ;
  }
}