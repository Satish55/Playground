import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      if(num2>num1)
        System.out.println("num2 is the greatest number");
      else
        System.out.println("num1 is the greatest number");
	}
}