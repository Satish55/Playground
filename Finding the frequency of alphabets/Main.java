import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in) ;
      String str = in.nextLine () ;
      //System.out.println(str) ;
      int arr_size = 26, offset = 0 ; 
      char ch ;
      int arr[] = new int[arr_size] ; 
      int isDone[] = new int[arr_size] ;
      for(int i = 0 ; i < str.length() ; i++) 
      {
         ch = str.charAt(i) ;
         if(ch <= 'z' && ch >= 'a') 
         {
            offset = ch - 'a' ;
            arr[offset] ++ ;
         }
         else if (ch <= 'Z' && ch >= 'A') 
         {
            offset = ch - 'A' ;
            arr[offset] ++ ;
         }
      }
      for(int i = 0 ; i < str.length() ; i++) 
      {
         ch = str.charAt(i) ;
         if(ch <= 'z' && ch >= 'a')         
            offset = ch - 'a' ;                     
         else if (ch <= 'Z' && ch >= 'A')
            offset = ch - 'A' ;
         ch = (char)(offset + 'a') ;         
         if(isDone[offset] != 1)
         {
            System.out.print(ch) ;         
            System.out.print(arr[offset]+" ") ;         
            isDone[offset] = 1 ;
         }
      }
    }
}