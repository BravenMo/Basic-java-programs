package student;

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		long acc=sc.nextLong();
		int balance=sc.nextInt();
	
		try {
			if(balance<5000) {
				throw new RuntimeException("Balance error");
			}
		}
		catch(RuntimeException a) {
			System.out.println(a);
		}
	}
}