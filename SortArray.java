/*
10
10 9 8 7 6 5 4 3 2 1
O/p: 1 2 3 4 5 6 7 8 9 10
*/

import java.util.*;
public class sortArray{
    public static void main(String[] args) {
    System.out.println("Sorting Array Without Sort Method ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
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

  }
}
