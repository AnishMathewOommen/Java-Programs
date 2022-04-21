import java.util.*;
public class PrimeNumber{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Prime Number Program");
      System.out.println("Enter The Number : ");
      int N=sc.nextInt();
      if(N==1 || N==0)
      {
        System.out.print(N+" is Not a Prime Number ");
        return;
      }
      else if(N>=2)
      {
        int endLoop=N/2;
        for(int ctr=2;ctr<=endLoop;ctr++)
         {
           if(N%ctr==0 && N!=ctr)
            {
              System.out.print(N+" is Not a Prime Number "); 
              return;
           }
         }

      }
      else if(N<0)
      {
        System.out.println("Please Type a Positive Number");
        return;
      }
        System.out.print(N+" is a Prime Number ");
      
      
    }
}
