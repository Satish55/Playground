import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in) ;
    char ch = in.next().charAt(0) ;
    int key = in.nextInt() ;
    //System.out.println(ch) ;
    //System.out.println(key) ;
    //ch = (char)(ch - key) ;
    //int offset ;
    //System.out.print(ch) ;
    //if(ch < 97)
    
    //System.out.print(ch) ;
    int  offset ;
    
    if(ch <= 'z' && ch >= 'a')
    {
       ch = (char)(ch - key) ;
       if(ch < 97)
       {
          offset = 97 - ch ;
          ch = (char)(123 - offset) ;
       }
    }
    else if(ch <= 'Z' && ch >= 'A')
    {
       ch = (char)(ch - key) ;       
    }
    System.out.print(ch);
    
    
  }
}