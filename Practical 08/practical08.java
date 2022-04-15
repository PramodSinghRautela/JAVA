class Student{
	int ID;
	String Name;
	String Branch;
	String City;
	String University;
	
	Student(int I){
		ID =I;
	}
	Student(int I,String N){
		this(I);
		Name = N;
	}
	Student(int I,String N,String B){
		this(I,N);
		Branch=B;
	}
	Student(int I,String N,String B,String C){
		this(I,N,B);
		City=C;
	}
	Student(int I,String N,String B,String C,String U ){
		this(I,N,B,C);
		University = U;
	}
	
	void display(){
		System.out.println("Details of the students are as follows:");
		System.out.println("Id 		    :"+ID);
		System.out.println("Name                :"+Name);
		System.out.println("Branch              :"+Branch);
		System.out.println("City                :"+City);
		System.out.println("University          :"+University);
	}
}

public class practical08{
	public static void main(String []args){
		Student s =new Student(20011441,"Pramod Singh Rautela","CSE","Dehradun","Graphic Era Hill University");
		s.display();
	}
}
