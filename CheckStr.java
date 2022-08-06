package programming;

import java.util.Scanner;

public class CheckStr {

	public static void main(String[] args) {
		String un= "MohitVarma2021";
		String password= "13456";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and password: ");
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		if(a.equals(un)&&b.equals(password)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
