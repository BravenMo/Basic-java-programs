package programming;
import java.util.*;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int columns=sc.nextInt();
		int arr[][]=new int[rows][columns];
		System.out.println("Enter "+(rows*columns)+" elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0;k<rows;k++) {
			for(int l=0;l<columns;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}

	}

}
