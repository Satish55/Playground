import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    int matrix2[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix1[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix2[i][j] = in.nextInt();
      }
    }
    int isEqual = 1 ; 
    for(int i = 0; i < r ; i++){
      for(int j = 0; j < c; j++){
        if(matrix1[i][j] != matrix2[i][j])
        {
           isEqual = 0 ;
           break ;
        }          
      }
    }
    if(isEqual == 0)
      System.out.println("No") ;
    else
      System.out.println("Yes") ;
  }
}