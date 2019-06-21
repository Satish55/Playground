import java.util.Scanner ;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner (System.in) ;
        int arr_size = in.nextInt() ;
        int arr[] = new int[arr_size] ;
        for(int i = 0 ; i < arr_size ; i++)
           arr[i] = in.nextInt() ;
        int count = 0 , count2 = 0 ;
        for(int i = 0 ; i < arr_size ; i++)
        {
           if(arr[i] == 1)
              count++ ;
           else
           {
              if(count > count2)
                 count2 = count ; 
              count = 0 ;
           }
        }
        System.out.println(count2) ;
    }
}