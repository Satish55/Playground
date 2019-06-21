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
     int a = arr[0] , count = 1 ;
     int b = arr[0] , count2 = 1;
     for(int i = 1 ; i < arr_size ; i++) 
     {
        if(b == arr[i])
        {
           count2++ ;
        }
        else
        {
          if(count2 > count)
          {
            count = count2 ;
            a = b ;
          }
          b = arr[i] ;
          count2 = 1 ;
        }
     }
     if(count2 > count)
     {
        count = count2 ;
        a = b ;
     }
     System.out.println(a) ;
  }
}