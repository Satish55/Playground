import java.util.Scanner;
class Main{
    public static void left_rotation_even(int arr[] , int arr_size)
    {
       //left_rotation_even
      int temp = arr[1] ;
      for(int i = 1 ; i < arr_size - 2 ; i = i+2)
      {
         arr[i] = arr[i+2] ;
      }
      if(arr_size % 2 == 0)
         arr[arr_size - 1] = temp ;
      else 
         arr[arr_size - 2] = temp ;
    }
    public static void right_rotation_odd(int arr[] , int arr_size)
    {
       // right rotation of odd position elements
      int last_odd_element ;
      if(arr_size % 2 == 0)
         last_odd_element = arr_size - 2 ;
      else 
         last_odd_element = arr_size - 1 ;
      int p = last_odd_element ;
      int temp = arr[p] ;
      for( ; p > 0 ; p = p - 2)
      {
         arr[p] = arr[p-2] ;
      }
      arr[0] = temp ;       
    }
    public static void main(String args[]) {
       // Type your code here
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size] ; 
       for(int i = 0 ; i < arr_size ; i++)
          arr[i] = in.nextInt();  
       int no_of_rotations = in.nextInt();
     
      for(int i = 1 ; i <= no_of_rotations ; i++)       
      right_rotation_odd(arr, arr_size);
               
      for(int i = 1 ; i <= no_of_rotations ; i++)       
      left_rotation_even(arr, arr_size);
      
      
      for(int i = 0 ; i < arr_size ; i++)
          System.out.print(arr[i]+" ");
    }
}