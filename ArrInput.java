package programming;
import java.util.Scanner;

public class ArrInput {

	public static void main(String[] args) {
		int a[]=new int[50];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to store in array? ");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements to store in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int j;
		System.out.println("The elements in the array are: ");
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println();
		int sum=0;
		for(j=0;j<n;j++) {
			sum=sum+a[j];
		}
		System.out.println("Sum of elements of the array are "+sum);
		
		double max=a[0];
		for(int l=0;l<n;l++) {
			if(a[l]>max)
				max=a[l];
		}
		System.out.println("The maximum element is "+max);

	}

}
