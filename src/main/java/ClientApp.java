import java.util.Scanner;
public class ClientApp {
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("-------Enter 1 for Simple,Compound Interest-------Enter 2 for Estimation of Construction Cost ");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter the Principal");
		 int principal=sc.nextInt();
		 System.out.println("Enter number of years");
		 int year=sc.nextInt();
		 System.out.println("Enter rate of Interest");
		 int rate=sc.nextInt();
		 
		 SimpleInterest object1=new SimpleInterest();
		 Compound_Interest object2=new Compound_Interest();
		 double valueof_SimpleInterest=object1.simple_interest(principal,year,rate);
		 double valueof_CompoundInterest=object2.compoundinterest(principal,year,rate);
		 
		System.out.println("the value of SIMPLE INTEREST:"+valueof_SimpleInterest);

		System.out.println("the value of COMPOUND INTEREST:"+valueof_CompoundInterest);
		break;
	case 2:
		System.out.println("Enter material Standard:1-standard,2-above standard,3-high standard or 4-high standard with fully automated ");
		
		int standard=sc.nextInt();
		System.out.println("Enter total area in square feet");
		int housearea=sc.nextInt();
		Cost_compute object3=new Cost_compute();
		int Total_Cost=0;
		if(standard==1)
		{
			Total_Cost=object3.totalcost(1200,housearea);
		}
		if(standard==2)
		{
			Total_Cost=object3.totalcost(1500,housearea);
		}
		if(standard==3)
		{
			Total_Cost=object3.totalcost(1800,housearea);
		}
		if(standard==4)
		{
			Total_Cost=object3.totalcost(2200,housearea);
		}
		
		System.out.println("The total cost:"+Total_Cost);
		break;
		default:
			System.out.print("wrong");
	}
	
	
	
	
	
 
 
  sc.close();
}




}
