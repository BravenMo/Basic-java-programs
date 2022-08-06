package student;

public class Call1 {
	public static void main(String[] args) {
		Basics obj=new Basics("VIT",230);
		Call2 obj1=new Call2(10,20);
		int ret=obj.function_One(obj1);
		System.out.println(ret);
		double a=66.5656;
		System.out.println((int)a);
	}
}
