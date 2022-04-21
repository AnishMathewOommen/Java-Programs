import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Fibonacci Series Program");
      System.out.println("Enter The Number of Terms : ");
      int N=sc.nextInt();
      
      int first=0,second=1,Next=0;
      if(N==1)
      System.out.print(first);
      else if(N==2)
      System.out.print(first+" "+second);
      else if(N>2)
      {
        System.out.print(first+" "+second+" ");
        N=N-2;
        while(N>0)
        {
          Next=first+second;
          System.out.print(Next+" ");
          first=second;
          second=Next;
          N-=1;
        
        }
      }
      else
      {
        System.out.print("Invalid Number");
      }
      
      
        
    }
}
