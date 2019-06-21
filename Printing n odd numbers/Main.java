import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner in = new Scanner(System.in);
       int count = in.nextInt();
       int i = 1;
       for( ; count > 0 ; count--,i=i+2)
       {
          System.out.println(i);
          //System.out.println("\n");
       }
	}
}