import java.util.Scanner;

class Student{
	static int ID;
	static String Name;
	static String Branch;
	static String University;
	
	public static void setId(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of student:");
		ID = sc.nextInt(); 		
		
	}
	public static void setDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of student:");
		Name = sc.nextLine();
		
		System.out.println("Enter the Branch of student:");
		Branch = sc.nextLine();		
	
		System.out.println("Enter the University of student:");
		University = sc.nextLine();	
	}
	
	public static void showDetails(){
		System.out.println("\n\nDetails of Students are :");
		System.out.println("ID : "+ ID);
		System.out.println("Name : "+ Name);
		System.out.println("Branch : "+ Branch);
		System.out.println("University : "+ University);
		
	}
}

public class practical05{
	public static void main(String []args){
	
	Student s1= new Student();
	s1.setId();
	s1.setDetails();
	s1.showDetails();
	
	}
}
