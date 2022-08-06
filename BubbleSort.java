package student;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int j=0;j<len;j++) {
			System.out.print(arr[j]+" ");
		}

	}

}
