package student;

import java.util.Scanner;

interface Vehicle{
	void Start();
	void Stop();
	void ChangeDir(String s);
	default void BlowHorn() {
		System.out.println("Blowing horn");
	}
}

class Car implements Vehicle{
	public void Start() {
		System.out.println("Starting car engine");
	}
	public void Stop() {
		System.out.println("Stopping car engine");
	}
	public void ChangeDir(String s) {
		System.out.println("Car direction changed to "+s);
	}
}
class Truck implements Vehicle{
	public void Start() {
		System.out.println("Starting truck engine");
	}
	public void Stop() {
		System.out.println("Stopping truck engine");
	}
	public void ChangeDir(String s) {
		System.out.println("Truck direction changed to "+s);
	}
}
public class Call {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car c1=new Car();
		Truck t1=new Truck();
		c1.Start();
		c1.BlowHorn();
		System.out.println("Enter the Direction to Turn the Vehicle: (Enter only Right/Left as your Input)");
		String a=sc.nextLine();
		c1.ChangeDir(a);
		c1.Stop();
		t1.Start();
		t1.BlowHorn();
		System.out.println("Enter the Direction to Turn the Vehicle: (Enter only Right/Left as your Input)");
		String b=sc.nextLine();
		t1.ChangeDir(b);
		t1.Stop();
	}
}
