public class practical06{
	public static void main(String []args){
		String s= "Java";	
		System.out.println("String by using Concatination "+s.concat("Welcome"));
		System.out.println("Charactor at index 1 is "+s.charAt(1));
		System.out.println("Index of char 'a' is "+s.indexOf("a"));
		System.out.println("IS Current string is equal to 'JAVA' : "s.equals("JAVA"));
		System.out.println("IS Current string is equal to 'JAVA'  if we ignore the Cases :  "+s.equalsIgnoreCase("JAVA"));
		System.out.println("Last index of 'a' in rhe string is: "+s.lastIndexOf("a"));
	}
}
