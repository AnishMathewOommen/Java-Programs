/*
5
1 2 3 4 5
3
O/p: 4 5 1 2 3
*/

import java.util.*;
public class leftRotateArray{
    public static void main(String[] args) {
    System.out.println("Left Rotation of an Array ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Number of times to perform left Rotation ");
    int rotate=sc.nextInt();
    rotate=rotate%N;               //Because Same Rotation takes place
    for(int i=0;i<rotate;i++)
    {
      int first=arr[0];
      for(int j=0;j<N-1;j++)
      {
        arr[j]=arr[j+1];
      }
      arr[N-1]=first;
    }
    System.out.println("After Left Rotation");
    for(int i=0;i<N;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
