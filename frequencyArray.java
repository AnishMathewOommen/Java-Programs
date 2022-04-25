/*
10
1 2 3 1 2 3 1 2 3 1
O/p: 1:4
     2:3
     3:3
*/

import java.util.*;
public class frequencyArray{
    public static void main(String[] args) {
    System.out.println("Frequency of Each Element in a Array ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number of Elements: ");
    int N=sc.nextInt();
    int[] arr=new int[N];
    int[] temp=new int[N]; //To Remove Duplicates
    System.out.println("Enter The Array Elements:");
    for(int i=0;i<N;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int ctr=0;
    for(int i=0;i<N-1;i++)
    {
      if(arr[i]!=arr[i+1])
      {
        temp[ctr++]=arr[i];
      }
    }
    temp[ctr++]=arr[N-1];
    for(int i=0;i<ctr;i++)
    {
      int count=0;
      for(int j=0;j<N;j++)
      {
        if(temp[i]==arr[j])
        {
          count++;
        }
      }
      System.out.println("Frequency of "+temp[i]+":"+count);
    }
    
  }
}
