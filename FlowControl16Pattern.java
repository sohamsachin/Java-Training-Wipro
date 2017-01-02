
import java.util.Scanner;

public class FlowControl16Pattern {
    
    public void PrintPattern(int n)
    {
        int i=1;
        while(n>0)
        {
             for(int j=0;j<i; j++)
             {
                 System.out.print("*"+"\t");
             }
             System.out.print("\n");
             i++;
             n--;
        }
    }
    public static void main(String[] args)
	{
		FlowControl16Pattern obj =new FlowControl16Pattern();
                int len =args.length;
                
                if(len>0)
                {
                    int num =Integer.parseInt(args[0]);
		    obj.PrintPattern(num);
                }
	
	}
}
