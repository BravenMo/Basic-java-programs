package programming;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=25;
		int b=15;
		int c=40;
		System.out.println(a>b||a<c);  
		System.out.println(a>b|a<c);
		System.out.println(a>b||a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);
		System.out.println(a);

	}

}
