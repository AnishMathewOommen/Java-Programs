/*
*******
 ******
  *****
   ****
    ***
     **
      *

*/

import java.util.*;
public class DownWardMirrorStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("DownWard Mirror Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=N;row>=1;row--)
    {
      for(int space=1;space<=N-row;space++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      {
         System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
