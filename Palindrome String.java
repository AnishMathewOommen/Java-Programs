import java.util.*;
public class PalindromeString{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Palindrome String Program");
      System.out.println("Enter The String : ");
      String reverse="";
      String N=sc.next();
      for(int i=N.length()-1;i>=0;i--)
      {
        reverse=reverse+N.charAt(i);
      }
     
      if(N.equals(reverse))
      {
        System.out.println(reverse+" is a Palindrome String ");
      }
      else
      {
        System.out.println(N+" is not a Palindrome String ");
      }
      
  }
}
