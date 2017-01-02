/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sohamsachin
 */
import java.util.Scanner;
 
class FlowControl17Reverse
{
    
   public  void Reverse()
   {
      int n, reverse = 0;
 
      System.out.println("Enter the number :");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse number : "+reverse);
   }
   public static void main(String args[])
   {
       FlowControl17Reverse obj =new FlowControl17Reverse();
       obj.Reverse();
   }
}