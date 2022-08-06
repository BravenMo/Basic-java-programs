package oop;

import java.util.Scanner;

public class ArrOfObj {
	Scanner sc=new Scanner(System.in);
	int accountno;
	String name;
	int amount;
	int balance;
	
	void insert() {
		accountno=sc.nextInt();
		name=sc.nextLine();
		amount=sc.nextInt();
	}
	
	void deposit(int n) {
		amount=amount+n;
	}
	
	void withdraw(int n) {
		amount=amount-n;
	}
	
	void checkBalance() {
		balance=amount;
	}
	
	void display() {
		System.out.println(accountno);
		System.out.println(balance);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrOfObj arr[]=new ArrOfObj[n];
		for(int i=0;i<n;i++) {
			arr[i].insert();
		}
		System.out.println("Enter account number and amount to deposit ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int j=0;j<n;j++) {
			if(arr[j].accountno==x) {
				arr[j].deposit(y);
				arr[j].display();
			}
		}
	}
}
