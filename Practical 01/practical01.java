//Practical 01

import java.util.Scanner;

class Student{
	int ID;
	String Name;
	String Branch;
	String University;
	
	public void setId(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of student:");
		ID = sc.nextInt(); 		
		
	}
	public void setDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of student:");
		Name = sc.nextLine();
		
		System.out.println("Enter the Branch of student:");
		Branch = sc.nextLine();		
	
		System.out.println("Enter the University of student:");
		University = sc.nextLine();	
	}
	
	public void showDetails(){
		System.out.println("\n\nDetails of Students are :");
		System.out.println("ID : "+ ID);
		System.out.println("Name : "+ Name);
		System.out.println("Branch : "+ Branch);
		System.out.println("University : "+ University);
		
	}
}

public class practical01{
	public static void main(String []args){
	
	Student s1= new Student();
	s1.setId();
	s1.setDetails();
	s1.showDetails();
	
	}
}
