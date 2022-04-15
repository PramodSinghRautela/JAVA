import java.util.Scanner;
class Account{
	String name;
	int account_No;
	int amount;
	
	public void insert(String n,int a,int b){
		this.name=n;
		this.account_No=a;
		this.amount=b;
	}
	public void deposit(int depo){
		amount+=depo;
		System.out.println("Rs"+depo+" has been deposited Successfully" );
		System.out.println("Now your current account balance is Rs"+amount);
	}
	public void withdraw(int wid){
		if(wid>amount){
			System.out.println("Insufficient balance to complete this traansaction");
		}
		else{
			amount -=wid;
			System.out.println("Amount Rs"+wid+" Has been withdrawed Successfully" );
			System.out.println("Now your current account balance is "+amount);
		}
	}
	public void checkBalance(){
		System.out.println("\nYour current account balance is Rs"+amount);
	}
	public void display(){
		System.out.println("\nAccount Holders Name:"+name);
		System.out.println("Account Number :"+account_No);
		System.out.println("Total amount in account:"+amount);
	}
}
public class practical02{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		Account a =new Account();
		System.out.println("Enter the name of account holder: ");		
		String x=sc.nextLine();
		System.out.println("Enter the account number: ");
		int y=sc1.nextInt();
		System.out.println("Enter the ammount: ")	;
		int z=sc1.nextInt();
		a.insert(x,y,z);
		a.display();
		System.out.println("\nEnter the ammount to be deposited ");
		int d=sc1.nextInt();
		a.deposit(d);
		System.out.println("\nEnter the ammount to Withdraw ");
		int w=sc.nextInt();
		a.withdraw(w);
		a.checkBalance();
	}
}

