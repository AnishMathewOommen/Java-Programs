/*
    *
   ***
  *****
 *******
*********
*/
import java.util.*;
public class PyramidTriangleStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Pyramid Triangle Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=1;row<=N;row++)
    {
      for(int col=1;col<=N-row;col++)
      {
        System.out.print(" ");
      }
      for(int star=1;star<=row;star++)
      {
         System.out.print("*");
      }
      for(int nextstar=1;nextstar<row;nextstar++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
