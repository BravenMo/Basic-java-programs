package student;
import java.util.Scanner;

public class Student {
	String name;
	String registerNo;
	int cat1;
	int cat2;
	int fat;
	char grade;
	
	Student(String n, String regno, int c1, int c2, int f){
		name=n;
		registerNo=regno;
		cat1=c1;
		cat2=c2;
		fat=f;
	}
	
	double calcPercentage() {
		System.out.println(cat1);
		double sum=cat1+cat2+fat;
		double percentage=((sum/120)*100);
		return percentage;
	}
	
	void calcGrade(double percentage) {
		if(percentage>=0 && percentage<=49) {
			grade='N';
		}
		else if(percentage>=50 && percentage<=59) {
			grade='D';
		}
		else if(percentage>=60 && percentage<=69) {
			grade='C';
		}
		else if(percentage>=70 && percentage<=79) {
			grade='B';
		}
		else if(percentage>=80 && percentage<=89) {
			grade='A';
		}
		else {
			grade='S';
		}
	}
	void display(double p) {
		System.out.println(name);
		System.out.println(registerNo);
		System.out.println(p+"%");
		System.out.println(grade);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String r=sc.nextLine();
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		int f=sc.nextInt();
		if((c1<0 || c1>30)||(c2<0 || c2>30)||(f<0 || f>60)) {
			System.out.println("Invalid input");
		}
		else {
			Student s1=new Student(n,r,c1,c2,f);
			double p=s1.calcPercentage();
			s1.calcGrade(p);
			s1.display(p);
			
		}
	}
	
}

