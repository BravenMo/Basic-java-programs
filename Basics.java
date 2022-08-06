package student;

public class Basics {
	
	int i;
	String b;
	
	Basics(String a, int bb){
		i=bb;
		b=a;
	}
	
	int function_One(Call2 obj) {
		System.out.println(obj.a);
		return (obj.a+10+i);
	}

}
