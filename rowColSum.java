import java.util.*;

public class rowColumnSum{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Row-Column Sum");
    System.out.println("Enter The Number of Rows: ");
    int row=sc.nextInt();
    System.out.println("Enter The Number of Columns: ");
    int col=sc.nextInt();
    int Matrix1[][]=new int[row][col];
    System.out.println("Enter The Matrix1 Values: ");
    
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        Matrix1[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<row;i++)
    {
      int sumRow=0;
      for(int j=0;j<col;j++)
      {
         sumRow=sumRow+Matrix1[i][j];
      }
      System.out.println("Sum of "+i+" row "+sumRow+" ");
    }
    
    for(int i=0;i<row;i++)
    {
      int sumCol=0;
      for(int j=0;j<col;j++)
      {
        sumCol+=Matrix1[j][i];
      }
      System.out.println("Sum of "+i+" col "+sumCol+" ");
    }
    
   
  }
}
