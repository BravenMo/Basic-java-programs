package programming;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		String a= sc.nextLine();
		String b=sc.nextLine();
		int la=a.length();
		int lb=b.length();
		int count=0;
		if(la==lb) {
			for(int i=0;i<la;i++) {
				if(a.charAt(i)==b.charAt(i)) {
					count=count+1;
				}
				
			}
			if(count==la) {
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are not equal");
			}
		}
		else {
			System.out.println("Strings are not equal");
			
		}
	}

}
