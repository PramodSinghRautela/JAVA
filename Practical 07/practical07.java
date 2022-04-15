class Buffer{
	public void show(){
		StringBuffer s =new StringBuffer("HELLO");
		s.append("Java");
		System.out.println("String after appending is :"+s);
	
		s.insert(1,"Java");	
		System.out.println("String after inserting Java at index 1 is:"+s);
	
		s.replace(1,2,"Java");
		System.out.println("String after replacing characters at index 1 and 2 with java  is:"+s);
	
		s.delete(1,3);
		System.out.println("String after deleting character between index 1 and 2 is "+s );
	
		s = new StringBuffer("HELLO");
		s.reverse();
		System.out.println("String HELLO after reversing is "+s);
	}
}

public class practical07{
	public static void main(String []args){
		Buffer sb =new Buffer();
		sb.show();
		
	}
}

