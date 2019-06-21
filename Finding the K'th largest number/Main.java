import java.util.Scanner;
class Main{
    public static void swap(int arr[] , int i , int j) 
    {
       int temp = arr[i] ; 
       arr[i] = arr[j] ;
       arr[j] = temp ;
    }
    public static int find_Min_Index(int arr[] , int start_idx , int end_idx) 
    {
       int min_idx = start_idx ;
       int min = arr[min_idx] ;
       for(int i = start_idx + 1 ; i < end_idx ; i++)
       {
          if(min > arr[i])
          {
             min_idx = i ;
             min = arr[i] ;
          }
       }
       return min_idx ;
    }
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner (System.in) ;
      int arr_size = in.nextInt() ;
      int arr[] = new int[arr_size] ;
      for(int i = 0 ; i < arr_size ; i++)
        arr[i] = in.nextInt() ;
      int k = in.nextInt() ;
      int min_idx ;
      for(int i = 0 ; i < arr_size ; i++) 
      {
         min_idx = find_Min_Index(arr , i , arr_size) ;
         swap(arr , i , min_idx) ;
         //for(int j = 0 ; j < arr_size ; j++)
           // System.out.print(arr[j]+" ") ;
      }
      int p = arr_size - k ;
      System.out.println(arr[p]) ;
    }   
}