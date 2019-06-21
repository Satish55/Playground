import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in) ;
      int arr_size = in.nextInt() ;
      int arr[] = new int[arr_size] ;
      for(int i = 0 ; i < arr_size ; i++)
        arr[i] = in.nextInt() ;
      //System.out.print(arr[3]) ;
      int i, j, k = 0;
      //System.out.print("\n");
      for(i = 0 ; i < arr_size ; i++)
      {
         for(j = i + 1 ; j < arr_size ; j++)
         {
            for(k = j + 1 ; k < arr_size ; k++)
            {
               System.out.print("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
               if(j != arr_size - 2 || k != arr_size - 1)
                  System.out.print(" ");               
            }
         }
         //if(i != arr_size -3 || j != arr_size - 2 || k != arr_size - 1)
         if(i != (arr_size - 3))
            System.out.println();
      }
    }
}