import java.util.Scanner;
import java.util.*;

public class SalesClass
   {
	//create string id,name and Degree as public
    public String Id;
    public String Name;
    public String Degree;
    public static String d;
    
    SalesClass(String id, String name, String degree){
        Id=id;
        Name=name;
        Degree=degree;
        
    }
    //main method
    public static void main(String[] args){
        SalesClass s1=new  SalesClass("M10001", "PAVAN KUMAR","B.tech");
        SalesClass s2=new  SalesClass("M10645", "RAVI","POST GRADUATE");
        SalesClass s3=new  SalesClass("M10258","RAVI", "MBA");
        SalesClass s4=new  SalesClass("M10698","NARESH", "Btech");
        SalesClass s5=new  SalesClass("M10653","VAMSI", "Btech");
        List < SalesClass> a=new ArrayList< SalesClass>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        
        for(SalesClass s:a)
        {
            System.out.println(s.Id+" "+s.Name+" "+s.Degree);
        }
        System.out.println("enter required 'id' who are selected to this job:(Here M is same for all id's and remaining  part you will enter below)");
        //use scanner class to take the input from the key board
        Scanner sc=new Scanner(System.in);
        String k="MXXXXX";
        System.out.print(k.substring(0,1));
        String c=k.substring(1,6);
        c=sc.nextLine();
         
        System.out.println(c);
        for( SalesClass s:a){
             if(s.Id.substring(1,6).trim().equals(c)){
                
           System.out.println("Required id details are:\n "+ s.Id+" "+s.Name+" "+s.Degree+"\n you are selected for this post salesman ");
        }//end if
        
        }//end for-each
        
        
    }//end main
}//end
