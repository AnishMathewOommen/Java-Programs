import java.util.*;
import java.lang.Math;
public class ArmstrongNumber{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Armstrong Number Program");
      System.out.println("Enter The Number : ");
      int N=sc.nextInt();
      int temp=N,digitCount=0,sum=0;
      while(temp>0)
      {
       digitCount++;       //Getting the number of digits
       temp/=10;
      }
      temp=N;           //assign back to temp to again loop
      while(temp>0)
      {
        int value=temp%10;
        sum=sum+(int)(Math.pow(value,digitCount)); //double to int
        temp/=10;
      }
      if(sum==N)
      {
        System.out.println(N+" is a Armstrong Number");
      }
      else
      {
        System.out.println(N+" is not a Armstrong Number");
      }
     
  }
}
