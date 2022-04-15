import java.util.Scanner;
class Shape{
	public void area(int s){
		System.out.println("Area of the Square is : "+(s*s));		
	}
	public void area(float r){
		System.out.println("Area of the circle is : "+(3.14f*r*r));
	}
	public void area(int l,int b){
		System.out.println("Area of the Rectangle is : "+(l*b));
	}
	public void area(float b,float h){
		System.out.println("Area of the Triangle is : "+(0.5f*b*h));
	}
}
public class practical11{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		Shape s1 = new Shape();
		System.out.println("Enter the side of square : ");
		int s = sc.nextInt();
		s1.area(s);
		
		System.out.println("Enter the radius of circle :");
		float r = sc.nextFloat();
		s1.area(r);
		
		System.out.println("Enter the length of rectangle :");
		int l =sc.nextInt();
		System.out.println("Enter the breadth of rectangle :");
		int b =sc.nextInt();
		s1.area(l,b);
		
		System.out.println("Enter the base of triangle :");
		float b1 = sc.nextFloat();
		System.out.println("Enter the height of triangle :");
		float h =sc.nextFloat();
		s1.area(b1,h);
	}
}
