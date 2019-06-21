import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size] ;
    for(int i = 0 ; i < arr_size ; i++)
    {
       arr[i] = in.nextInt();
    }
    int sum_required = arr[0] + arr[1] + arr[2] ;
    int sum = 0 ;
    int is_Not_Perfect_Batch = 0 ;
    for(int i = 3 ; i < arr_size ; i = i + 3)
    {
       sum = sum + arr[i] + arr[i+1] + arr[i+2] ; 
       if(sum != sum_required)
       {
          is_Not_Perfect_Batch = 1 ;
          break ;
       }
       sum = 0 ;
    }
    if(is_Not_Perfect_Batch == 1)
       System.out.print("Not a Perfect Batch");
    else 
       System.out.print("Perfect Batch");
  }
}