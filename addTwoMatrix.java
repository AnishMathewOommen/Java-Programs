import java.util.*;

public class addTwoMatrix{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Addition of Two Matrices");
    System.out.println("Enter The Number of Rows: ");
    int row=sc.nextInt();
    System.out.println("Enter The Number of Columns: ");
    int col=sc.nextInt();
    int Matrix1[][]=new int[row][col];
    int Matrix2[][]=new int[row][col];
    System.out.println("Enter The Matrix1 Values: ");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        Matrix1[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter The Matrix2 Values: ");
     for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        Matrix2[i][j]=sc.nextInt();
      }
    }
    int Sum[][]=new int[row][col]; 
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        Sum[i][j]=Matrix1[i][j]+Matrix2[i][j];
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.print(Sum[i][j]+" ");
      }
      System.out.println();
    }
   
    }
}
