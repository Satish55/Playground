import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner in = new Scanner (System.in) ;
       int arr_size = in.nextInt() ;
       int arr[] = new int[arr_size] ;
       for(int i = 0 ; i < arr_size ; i++) 
         arr[i] = in.nextInt() ;
       //System.out.println(arr[3]) ;
       int isPalindrome = 1 ;
       int front = arr[0] ;
       int back = arr[arr_size - 1] ;
       for(int i = 0 , j = arr_size - 1 ; i <= ((arr_size - 2) / 2) ; i++, j--) 
       {
          if(arr[i] != arr[j])
          {
             isPalindrome = 0 ; 
             break ;
          }
       }
       if(isPalindrome == 1)
         System.out.println("Yes") ;
       else
         System.out.println("No") ;
    }
}