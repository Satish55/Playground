import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int n1 = a%10;
    int n3 = a/100;
    int n2 = (a/10)%10;
    int temp = n1;
    n1 = n3;
    n3 = temp;
    int b = n1 + (n2*10) + (n3*100);
    System.out.println(b);
  }
}