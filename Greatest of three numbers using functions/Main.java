import java.util.Scanner;
class Main{
    public static int greater_number(int n1 , int n2)
    {
       if(n1 >= n2)
          return n1 ;
       else 
          return n2 ;
    }
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
       int greater1 = greater_number(n1 , n2);
       int greater2 = greater_number(greater1 , n3);
       System.out.print(greater2);
	}
}