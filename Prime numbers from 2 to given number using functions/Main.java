import java.util.Scanner;
class Main{
    public static void is_it_prime(int i)
    {       
       int isprime = 0 ;
       if((i == 2) || (i == 3))
          isprime = 0;
       for(int j = 2 ; j < i ; j++)
       {
          if(i % j == 0)
          {
             isprime = 1 ;
             break ;
          }          
       }
       if(isprime == 0)
       {
          System.out.println(i); 
       }
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i = 2 ; i < num ; i++)
      {
         is_it_prime(i);
      }
	}
}