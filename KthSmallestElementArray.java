/*
10
9 8 9 1 7 2 1 6 4 8
4
O/p: 4
*/

import java.util.*;
public class KthSmallestElementArray{
    public static void main(String[] args) {
    System.out.println("Kth Smallest Element in an Array ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter The Kth Index ");
    int index=sc.nextInt();
    for(int i=0;i<N-1;i++)
    {
      for(int j=i+1;j<N;j++)
      {
        if(arr[i]>arr[j])
        {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
      }
    }
    System.out.println("After Sorting");
    for(int i=0;i<N;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("The Smallest Element in the "+index+" index is "+arr[index-1]);

  }
}
