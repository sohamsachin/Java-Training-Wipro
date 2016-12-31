
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sohamsachin
 */
public class Project1 {
     
  
  
    int[] salary;
       
   public int  getSalary(String empno)
   {
       int salary=0;
       int[] empdtl=getBHI(empno);
       int DA=getDA(empno);
       salary=empdtl[0]+empdtl[1]-empdtl[2]+DA;
       return salary;
      
   }
   public String[] getDetail(String empno)
   {
       String[] detail =new String[3];
       for(int i=0;i<7; i++)
       {
           if(EmpDtl[i][0].equals(empno))
           {
                detail[0]=EmpDtl[i][0];
                detail[1]=EmpDtl[i][1];
                detail[2]=EmpDtl[i][2];
                
           }
           break;
       }
       return detail;
   }
   public char getDesgCode(String empno)
   {
       char DesgCode='g';
       for(int i=0;i<7; i++)
       {
           if(EmpDtl[i][0].equals(empno))
           {
               DesgCode=EmpDtl[i][3].charAt(0);
           }
           
           }
       return DesgCode;
   }
    public int getDA(String empno)
   {
       char desgCode= getDesgCode(empno);
       int DA=0;
       
       switch(desgCode)
       {
           case 'e':
               DA=20000;
               break;
               
           case 'c':
               DA=32000;
               break;
               
           case 'k':
               DA=12000;
               break;
               
           case 'r':
               DA=15000;
               break;    
       }
       return DA;
   }
   
    public String getDesg(String empno)
   {
       char desgCode= getDesgCode(empno);
       String desg="";
       
       switch(desgCode)
       {
           case 'e':
               desg="Engineer";
               break;
               
           case 'c':
               desg="Consultant";
               break;
               
           case 'k':
               desg="Clerk";
               break;
               
           case 'r':
               desg="Receptionist";
               break; 
               
       }
       return desg;
   }
    
   public int[] getBHI(String empno)
   {
       int[] bhi= new int[3];
       for(int i=0;i<7; i++)
       {
           if(EmpDtl[i][0].equals(empno))
           {
                bhi[0]=Integer.parseInt(EmpDtl[i][6]);
                bhi[1]=Integer.parseInt(EmpDtl[i][7]);
                bhi[2]=Integer.parseInt(EmpDtl[i][8]);
                
           }
           break;
       }
       
       return bhi;
   }
  public void printDetail(String[] empDetail,String Desg,int salary)
  {
      System.out.println("Emp no."+"\t"+"Emp Nmae"+"\t"+"Department"+"\t"+"Designation"+"\t"+"Salary");
      System.out.println(empDetail[0]+"\t"+empDetail[1]+"\t"+empDetail[2]+"\t"+Desg+"\t"+salary);
  }
   public static void main(String[] args)
   {
	   String [][] EmpDtl={
         {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
         {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
         {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
         {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
         {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
         {"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
         {"1007","Tanmay","12/06/2006","c","PM","2000","12000","10000"}
     };
    
      p.printDetail(p.getDetail(args[0]), p.getDesg(args[0]),p.getSalary(args[0]));
   }
    
}
