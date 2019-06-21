import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size] ; 
       for(int i = 0 ; i < arr_size ; i++)
          arr[i] = in.nextInt();  
       int array2[] = new int[arr_size] ;
       int j = 0 ;
       for(int i = 0 ; i < arr_size ; i++)
       {
          if(arr[i] != 0)
          {
             array2[j++] = arr[i] ;             
          }
       }
       for(int k = j ; k < arr_size ; k++)
       {
          array2[k] = 0 ; 
       }
       for(int i = 0 ; i < arr_size ; i++)
          System.out.print(array2[i]+" ");
    }
}