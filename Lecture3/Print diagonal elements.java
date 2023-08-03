                                  //PRINT DIAGONAL ELEMENTS


class Main{
   
static int MAX = 100;
     
// Function to print the Principal Diagonal
public static void printPrincipalDiagonal(int mat[][],
                                          int n)
{
  System.out.print("Principal Diagonal: ");
 
  for (int i = 0; i < n; i++)
  {
    // Printing principal diagonal
    System.out.print(mat[i][i] + ", ");
  }
  System.out.println();
}
 
// Function to print the Secondary Diagonal
public static void printSecondaryDiagonal(int mat[][],
                                          int n)
{
  System.out.print("Secondary Diagonal: ");
  int k = n - 1;
   
  for (int i = 0; i < n; i++)
  {
    // Printing secondary diagonal
    System.out.print(mat[i][k--] + ", ");
  }
  System.out.println();
}
 
public static void main(String[] args)
{
  int n = 4;
  int a[][] = {{1, 2, 3, 4},
               {5, 6, 7, 8},
               {1, 2, 3, 4},
               {5, 6, 7, 8}};
  printPrincipalDiagonal(a, n);
  printSecondaryDiagonal(a, n);
}
}