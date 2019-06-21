import java.util.Scanner;
public class Main{
    public static int gcd_of_two(int n1, int n2)
    {
       int gcd = 1 ;
       int smaller = n1 ;
       if(n1 > n2)
          smaller = n2 ;
       for(int i = 2 ; i <= smaller ; i++)
       {
          if((n1 % i == 0) && (n2 % i == 0))
             gcd = i ;
       }
       return gcd ; 
    }
	public static void main (String[] args)
	{
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int gcd1 = gcd_of_two(n1 , n2);
        int gcd2 = gcd_of_two(gcd1 , n3);
        System.out.print(gcd2);
	}
}