import java.util.*;

public class rightTriangleStarPattern{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Right Triangle Star Pattern Program ");
    System.out.println("Enter The Number of Rows ");
    System.out.println();
    int N=sc.nextInt();
    for(int row=1;row<=N;row++)
    {
      for(int col=1;col<=row;col++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
