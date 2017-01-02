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

public class FlowControl12Prime
{
	
	
	public void CheckPrime()
	{
		
		System.out.println("Enter Positive no:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int i,flag=0;
		
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
			System.out.println("Number is Prime");
			
		}else{
			System.out.println("Number is not Prime");
		}
	}
	
	public static void main(String[] args)
	{
		FlowControl12Prime obj =new FlowControl12Prime();
		obj.CheckPrime();
	
	}
}
