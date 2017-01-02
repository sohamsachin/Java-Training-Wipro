
import java.util.Scanner;

public class FlowControl14Add {
    
    public void AddAll()
    {
        System.out.println("Enter Positive no:");
		Scanner sc= new Scanner(System.in);
                
              int num =sc.nextInt();
              int temp=num;
              int total=0;
             for(int i=0; i<num; i++)
             {
                 total=total+(num%10);
                 
                 num=num/10;
                 System.out.println("total :"+total+" num :"+num);
                 
             }
             total=total+num;
             System.out.println(temp+"-->"+total);
    }
    public static void main(String[] args)
	{
		FlowControl14Add obj =new FlowControl14Add();
		obj.AddAll();
	
	}
}
