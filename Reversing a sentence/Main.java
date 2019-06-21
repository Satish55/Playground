import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner in = new Scanner(System.in) ;
        String str = in.nextLine() ;
        StringBuilder sb = new StringBuilder(str) ;
        //System.out.println(str) ;
        int start_idx = 0 ;
        int end_idx = sb.length() - 1 ;
        //System.out.print(end_idx) ;
        int a, b ;
      
        start_idx = end_idx ;
        while(start_idx != 0)
        {
           for( ; sb.charAt(start_idx) != ' ' ; start_idx--)
           {  
           
           }
           b = start_idx ;
           start_idx++ ;
           reverse_string(sb, start_idx, end_idx) ;
           start_idx = --b ; 
           end_idx = b ;
        }
        reverse_string(sb, start_idx, end_idx) ;
      
    }    
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
        //System.out.print(sb) ;
        //start_idx = end_idx ;
        for(int i = start_idx ; i <= end_idx ; i++)
        {
            System.out.print(sb.charAt(i)) ; 
        }
        System.out.print(" ") ;
    }
}