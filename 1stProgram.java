public class Ex1 
{
	//create main method
	public static void main(String args[])
	{
		//taking input values through scanner class in util package
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//prompt the user for print enter fees
		System.out.println("enter fees");
		//store the fees in variable fees
		int fees=sc.nextInt();
		//prompt the user for taking 10th marks
		System.out.println("enter 10th marks");
		//store marks in variable marks
		int marks=sc.nextInt();
		//calling method caldiscount
		caldiscount(fees, marks);
	}//end of main method

    //create caldiscount method
	public static void caldiscount(int fees,int marks) 
	{
		//intialize the variable
		int discount=0;
		//using if checking the condiotion 
		if(marks>90&& marks<100)
		{
			//calculate discount 
			discount=(int) (fees*0.50);
			//print discount
			System.out.println(discount);
			
		}//end of if block
		//check the given condition
		else if(marks<=81 && marks>=90)
		{
			//calculate discount
			discount=(int) (fees*0.20);
			//print discount
			System.out.println(discount);
		}//end of else if block
		else if(marks<=70 && marks>=80)
		{
			//calculate discount
			discount=(int) (fees*0.10);
			//print discount
			System.out.println(discount);
		}//end of else if block
		else if(marks<70&& marks>=1)
		{
			//calculate discount
			discount=(int)(fees*0.00);
			//print discount
			System.out.println(discount);
			
		}//end of else if
		else if(marks>100)
		{
			//print invalid mark
			System.out.println("invalid mark");
		}//end of else if block
		else if(marks<1 && fees<1)
		{
			//print invalid input
			System.out.println("invalid input");
		}//end of else if block
		
	}//end of class block


}
