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

public class FlowControl12PrimeB
{
	
	
	public void PrintPrime()
	{
		
		
		
		int i,flag=0;
                System.out.println("Prime no. between 10 to 99 are :");
		for(int j=10; j<99; j++)
                {
		for(i=2; i<j; i++)
		{
			if(j%i==0)
			{
				flag=1;
				break;
			}
		}
                if(flag==1)
		{
		
			flag=0;
		}
                else
                {
                    System.out.println(j);
                }
                }
		
	}
	
	public static void main(String[] args)
	{
		FlowControl12PrimeB obj =new FlowControl12PrimeB();
		obj.PrintPrime();
	
	}
}
