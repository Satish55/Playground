import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i <= r - 1; i++){
      for(int j = 0; j < c; j++){
        if(i == j)
        System.out.print(matrix[i][j] + " ");
      }
    }
    for(int i = 0; i <= r - 1; i++){
      for(int j = 0; j < c; j++){
        if(j - i == 1)
        System.out.print(matrix[i][j] + " ");
      }
    }
    for(int i = 0; i <= r - 1; i++){
      for(int j = 0; j < c; j++){
        if(j - i == 2)
        System.out.print(matrix[i][j] + " ");
      }
    }
  }
}