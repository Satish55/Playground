import java.util.Scanner ;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner (System.in) ;
    int arr_size = in.nextInt() ;
    int arr[] = new int[arr_size] ;
    for(int i = 0 ; i < arr_size ; i++)
      arr[i] = in.nextInt() ;
    int sum = arr[0] , sum2 = arr[0] ; 
    for(int i = 1 ; i < arr_size ; i++)      
    {
       if(arr[i] > arr[i-1])
       {
          sum2 = sum2 + arr[i] ;
       }
       else 
       {
          sum2 = arr[i] ;
          if(sum2 > sum)
            sum = sum2 ;
       }
    }
    if(sum2 > sum)
      sum = sum2 ;
    System.out.println(sum) ;
  }
}