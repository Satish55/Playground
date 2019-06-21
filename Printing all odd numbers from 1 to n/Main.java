import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int i = 1;
       for(i=1 ; i<=n ; i=i+2)
       {
          System.out.print(i);
          System.out.print("\n");
       }
	}
}