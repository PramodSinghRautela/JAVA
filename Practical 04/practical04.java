import java.util.Scanner;

class Employee{
	int ID;
	String Name;
	String department;
	int salary;
	
	Employee(){
		System.out.println("Enter the details of the employee  :");
	}
	
	public void setDetails(int i,String n,String d,int s){
		this.ID=i;
		this.Name=n;
		this.department=d;
		this.salary=s;
	}	
	
	public void showDetails(){
		System.out.println("\nThe details of the employee are as follows: ");
		System.out.println("ID : "+ID);
		System.out.println("Name : "+Name);
		System.out.println("Department : "+department);
		System.out.println("Salary :Rs "+salary);
	}
}

public class practical04{
	public static void main(String []args){
		int id,s;
		String n,d;
		Employee e = new Employee();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the ID : " );
		id= sc.nextInt();
		System.out.println("Enter the Name of the employee : " );
		n= sc1.nextLine();
        	System.out.println("Enter the Department : " );
        	d = sc1.nextLine();
        	System.out.println("Enter the Salary :");
        	s=sc.nextInt();
        	
        	e.setDetails( id, n, d,s);
		e.showDetails();
	}
}
