import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Palindrome Number Program");
      System.out.println("Enter The Number : ");
      int N=sc.nextInt();
      int temp=N,reverse=0;
      while(temp>0)
      {
        reverse=reverse*10+temp%10;
        temp/=10;
      }
      if(N==reverse)
      {
        System.out.println(reverse+" is a Palindrome Number ");
      }
      else
      {
        System.out.println(reverse+" is not a Palindrome Number ");
      }
      
      
    }
}
