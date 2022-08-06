package oop;

import java.util.Scanner;

class Rectangle1{
	int length;
	int breadth;
	
	Rectangle1(int l,int b){
		length=l;
		breadth=b;
	}
	
	int getArea() {
		return length*breadth;
	}
	
}
public class ArrayOfObj {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle1 rect[]=new Rectangle1[2];
		System.out.println("Enter length and breadth for 2 rectangles: ");
		
		for(int i=0;i<2;i++) {
			int l=sc.nextInt();
			int b=sc.nextInt();
			rect[i]=new Rectangle1(l,b);
		}
		System.out.println("Areas are ");
		for(int j=0;j<2;j++) {
			System.out.println(rect[j].getArea());
		}

	}

}
