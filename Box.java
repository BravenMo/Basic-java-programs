package oop;

public class Box {
	double width,height,depth;
	
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width=height=depth=0;
	}
	double volume() {
		return width*height*depth;
	}
	void display() {
		System.out.println(width+" "+height+" "+depth);
	}
	public static void main(String[] args) {
		Box b1=new Box(20.6,14.7,45.6);
		Box b2=new Box();
		b1.display();
		System.out.println(b1.volume());
		b2.display();
		System.out.println(b2.volume());
	}
}
