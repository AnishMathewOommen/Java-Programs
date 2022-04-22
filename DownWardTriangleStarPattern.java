/*
  * * * * * * * 
  * * * * * * 
  * * * * * 
  * * * * 
  * * * 
  * * 
  * 
*/

import java.util.*;
public class DownWardTriangleStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("DownWard Triangle Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=N;row>=1;row--)
    {
      for(int col=1;col<=row;col++)
      {
         System.out.print("* ");
      }
      System.out.println();
    }
    
  }
}
