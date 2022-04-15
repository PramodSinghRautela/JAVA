import java.util.Scanner;
class TwoDArray{
	public void insert(int [][]arr,int m,int n){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element in the 2D array:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				num=s.nextInt();
				arr[i][j]=num;
			}
		}
		
	}
	
	public void search(int [][]arr,int m,int n,int element){
	    int flag=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(element==arr[i][j]){
				    flag=1;
				    break;
				}
			}
		}
		if(flag==1){
			System.out.println("Element is Present in the array.");
		}
		else{
		    System.out.println("Element not found in the array");
		}

	}
	
	public void traverse(int [][]arr,int m,int n){
		System.out.println("Element present in 2-D Array are: ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class practical09{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		int m,n;
		System.out.println("Enter the number of rows :");
        m = sc.nextInt();
		System.out.println("Enter the number of columns :");
		n = sc.nextInt();
		int [][]arr = new int[m][n];
		TwoDArray a = new TwoDArray();
		
		a.insert(arr,m,n);
		a.traverse(arr,m,n);
		System.out.println("Enter the element to search in array :");
		int key = sc.nextInt();
		a.search(arr,m,n,key);
	}
	
}
