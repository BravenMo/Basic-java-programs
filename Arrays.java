package student;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] ar=new int[a];
		for(int i=0;i<a;i++) {
			ar[i]=sc.nextInt();
		}
		int freq=1;
		int[] kr=ar;
		for(int j=0;j<a;j++) {
			if(kr[j]!=0) {
			int s=kr[j];
			for(int k=j+1;k<a;k++) {
				if(s==ar[k]) {
					freq=freq+1;
					kr[k]=0;
				}
			}
			System.out.println(s+" "+freq);
			kr[j]=0;
			freq=1;
		}}

	}

}
