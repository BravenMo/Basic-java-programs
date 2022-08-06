package programming;

public class ifLadder {
	public static void main(String[] args) {
		int x=20;
		int y=15;
		int z=30;
		if(x>y) {
			if(x>z) {
				System.out.println("Largest numbers is: "+x);
			}
			else {
				System.out.println("Largest number is: "+z);
			}
		}
		else {
			if(y>z) {
				System.out.println("Largest number is: "+y);
			}
			else {
				System.out.println("Largest number is: "+z);
			}
		}
	}

}
