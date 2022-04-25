/*
10
9 8 9 1 7 2 1 6 4 8
O/p: 1 2 4 6 7 8 9
*/

import java.util.*;
public class removeDuplicatesUnsortedArray{
    public static void main(String[] args) {
    System.out.println("Removing Duplicates from UnSorted Array ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<N-1;i++)
    {
     if(arr[i]!=arr[i+1])
     {
       System.out.print(arr[i]+" ");
     }
    }
    System.out.print(arr[N-1]);

  }
}
