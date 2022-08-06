package programming;
import java.util.Scanner;
public class UserEntry {
	
	int def=25;
	UserEntry(int a,int b){
		if(a>=b) {
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(b);
			System.out.println(a);
		}
	}
	UserEntry(int a){
		if(a>=def) {
			System.out.println(a);
			System.out.println(def);
		}
		else {
			System.out.println(def);
			System.out.println(a);
		}
	}
}
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int a=0;int b=0;
		System.out.println(c);
		if(c==1) {
			a=sc.nextInt();
		}
		else if(c==2) {
			a=sc.nextInt();
			b=sc.nextInt();
		}
		if(a<0 || b<0) {
			System.out.println("Negative number entry not allowed");
		}
		else {
			if(c==1) {
				UserEntry u1;
				u1=new  UserEntry(a);
			}
			else {
				UserEntry u2;
				u2=new UserEntry(a,b);
			}
		}
	}
	
}