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

public class FlowControl13PrimeC
{
	
	
	public void CheckPrime()
	{
		
		System.out.println("Enter Positive no:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int i,flag=0;
		if(num>1)
                {
              
                
		for(i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is Prime Number ");
			
		}else{
			System.out.println(num + " is not a Prime Number ");
		}
	}else
                {
                    System.out.println(num+" is neither prime nor composite");
                }
        }
	
	public static void main(String[] args)
	{
		FlowControl13PrimeC obj =new FlowControl13PrimeC();
		obj.CheckPrime();
	
	}
}
