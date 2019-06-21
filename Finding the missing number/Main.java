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
       int arr2[] = new int[arr_size + 1] ;
       for(int i = 0 ; i < arr_size ; i++)
       {
          if(arr[i] <= arr_size && arr[i] > 0)
             arr2[arr[i]] ++ ;
       }
       for(int i = 1 ; i <= arr_size ; i++)
       {
          if(arr2[i] == 0)
             System.out.println(i) ;
       }
    }
}