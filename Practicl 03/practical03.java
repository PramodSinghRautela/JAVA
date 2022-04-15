class sum{
	int x;
	int y;
	public void setXY(int a,int b){
		this.x=a;
		this.y=b;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int Sum(){
		return x+y;
	}
}

public class practical03{
	public static void main(String []args){
		sum s1 = new sum();
		s1.setXY(12,13);
		
		System.out.println("Sum of 12 + 13  is : "+s1.Sum());
	}
}
