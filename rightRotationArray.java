/*
5
1 2 3 4 5
4
O/p: 2 3 4 5 1
*/

import java.util.*;
public class rightRotateArray{
    public static void main(String[] args) {
    System.out.println("Right Rotation of an Array ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Number of times to perform Right Rotation ");
    int rotate=sc.nextInt();
    rotate=rotate%N;               //Because Same Rotation takes place
    for(int i=0;i<rotate;i++)
    {
      int last=arr[N-1];
      for(int j=N-1;j>0;j--)
      {
        arr[j]=arr[j-1];
      }
      arr[0]=last;
    }
    System.out.println("After Right Rotation");
    for(int i=0;i<N;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
