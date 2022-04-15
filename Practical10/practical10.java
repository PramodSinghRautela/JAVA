import java.util.*;
public class practical10{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
 		int [][]jArr = new int[3][];
		jArr[0] = new int [3]; 
		jArr[1] = new int [4];
		jArr[2] = new int [2];
	
		System.out.println("Enter the elements in the jagged array:");
		for(int i=0;i<jArr.length;i++){
			for(int j=0;j<jArr[i].length;j++){
				jArr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Element in Jagged array are:");
		for(int i=0;i<jArr.length;i++){
			for(int j=0;j<jArr[i].length;j++){
				System.out.print(jArr[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
