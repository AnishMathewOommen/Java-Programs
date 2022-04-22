/*
*************
 ***********
  *********
   *******
    *****
     ***
      *
*/
import java.util.*;
public class ReversePyramidStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Reverse Pyramid Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=N;row>=1;row--)
    {
      for(int space=1;space<=N-row;space++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=2*row-1;col++)
      {
         System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
