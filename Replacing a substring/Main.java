import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner (System.in) ;
      String str = in.nextLine() ;
      String str2 = in.nextLine() ;
      String str3 = in.nextLine() ;
      //System.out.print(str2) ;
      char ch ;      
      int p = 0, j = 0 ;
      StringBuilder sb = new StringBuilder("") ;
      for(int i = 0 ; i < str.length() ; i++) 
      {         
         if(str2.charAt(j) == str.charAt(i)) 
         {
           p = i ;
           break ;           
         }
      }
      int str_len = str2.length() ;
      for(int i = 0 ; i < p ; i++) 
      {
         sb.append(str.charAt(i)) ;
      }
      sb.append(str3) ;
      for(int i = p + str2.length() ; i < str.length() ; i++)
      {
          sb.append(str.charAt(i)) ;
      }
      System.out.println(sb) ;
    }
}