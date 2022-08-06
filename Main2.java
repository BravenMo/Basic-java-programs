package oop;

import java.util.Scanner;

public class Main2 {
	
	void encrypt(int n) {
		int d=0;
		int digit=0;
		int rev=0;
		int count=1;
		while(n>0) {
			d=d%10;
			digit=d+7;
			digit=digit%10;
			rev=digit+(rev*10);
			count=count+1;
		}
		int x=rev;
		int[] digits=new int[count];
		int i=0;
		while(x>0) {
			int d2=x%10;
			digits[i]=d2;
			i=i+1;
			x=x/10;
		}
		int temp=digits[0];
		digits[0]=digits[2];
		digits[2]=temp;
		int temp2=digits[1];
		digits[1]=digits[3];
		digits[3]=temp2;
		String s="";
		for(int j=0;j<=i;j++) {
			s=""+digits[j];
		}
		System.out.println(s);
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Main2 obj=new Main2();
		obj.encrypt(n);
	}
}
