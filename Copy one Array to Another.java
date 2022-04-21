import java.util.*;
public class copyArray{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Array Size: ");
      int N=sc.nextInt();
      int arr1[]=new int[N];
      int arr2[]=new int[N];
      for(int i=0;i<N;i++)
      {
        arr1[i]=sc.nextInt();
      }
      for(int i=0;i<N;i++)
      {
        arr2[i]=arr1[i];
      }
      for(int i=0;i<N;i++)
      {
        System.out.print(arr2[i]+" ");
      }
      
  }
}
