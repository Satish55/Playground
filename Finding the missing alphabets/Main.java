import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner (System.in) ;
      String str = in.nextLine () ;
      int arr_size = 26 ;
      int offset ;
      char ch ;
      int arr[] = new int[arr_size] ;
      for(int i = 0 ; i < str.length() ; i++)
      {
         ch = str.charAt(i) ;
         if(ch <= 'z' && ch >= 'a') 
         {
            offset = ch - 'a' ;
            arr[offset]++ ; 
         }
         else if(ch <= 'Z' && ch >= 'A')
         {
            offset = ch - 'A' ;
            arr[offset] ++ ;
         }
      }
      for(int i = 0 ; i < arr_size ; i++) 
      {
         if(arr[i] == 0)
         {
            ch = (char)('a' + i) ;
            System.out.print(ch+" ") ;
         }
      }
    }
}