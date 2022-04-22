/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
import java.util.*;
public class DiamondTriangleStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Diamond Triangle Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=1;row<=N;row++)
    {
      for(int col=1;col<=N-row;col++)
      {
        System.out.print(" ");
      }
      for(int star=1;star<=2*row-1;star++)
      {
         System.out.print("*");
      }
      System.out.println();
    }
    
    for(int row=1;row<=N;row++)
    {
      for(int col=N-1;col>=N-row;col--)
      {
        System.out.print(" ");
      }
      for(int star=1;star<=2*(N-row)-1;star++)
      {
         System.out.print("*");
      }
      
      System.out.println();
    }

  }
}
