
class Person{
	int id;
	String name;
	String city;		
	
	Person(int id,String name,String city ){
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId(){

		return id;
	}
	public String getName(){

		return name;
	}
	public String getCity(){

		return city;
	}

}
class Employee extends Person{

	int salary;
	Employee(int id,String name,String city ,int sal){
		super(id,name,city);
	   this.salary = sal;
	
	}

	public void setSalary(int sal){
	   this.salary = sal;
	}
	public int getSalary(){

		return salary;
	}
	
	public void showDetails(){
		System.out.println("Details of the employee are :");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("City : "+ city);
		System.out.println("Salary Rs: "+ salary);

		
	}

}

public class practical13{
	public static void main(String []args){
	 Employee e1 =new  Employee(1221,"RAJU","DOON",1333333);

	e1.showDetails();	
        
	
}
}
