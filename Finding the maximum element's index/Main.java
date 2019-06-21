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
    int maximum_element = arr[0] ;
    int maximum_element_index = 0 ; 
    for(int i = 1 ; i < arr_size ; i++)
    {
       if(maximum_element < arr[i])
       {
          maximum_element = arr[i] ;
          maximum_element_index = i ;
       }
    }
    System.out.print(maximum_element_index);
  }
}