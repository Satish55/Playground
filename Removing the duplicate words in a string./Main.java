import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner (System.in) ;
    String str = in.nextLine() ;
    //System.out.println(str) ;
    String arr[] = str.split(" ",5) ;
    for(int i = 0 ; i < arr.length ; i++) 
    {
       String res = arr[i] ; 
       //System.out.println(res) ;
    }
    int arr2[] = new int[arr.length] ;
    for(int k = 0 ; k < arr.length ; k++)
       arr2[k] = -1 ;      
    for(int i = 0 ; i < arr.length ; i++)      
    {
       for(int j = i + 1 ; j < arr.length ; j++) 
       {
          if(arr[i].equals(arr[j]) == true)
          {
             arr2[j] = 0 ;
          }
       }
    }
    for(int p = 0 ; p < arr.length ; p++)
    {
       if(arr2[p] != 0)
       {
         System.out.print(arr[p]) ; 
         System.out.print(" ") ;
       }
    }
  }
}