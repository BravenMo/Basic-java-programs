package programming;

public class ArrDemo {

	public static void main(String[] args) {
		int array[]=new int[7];
		for(int count=0;count<7;count++) {
			array[count]=count+1;
		}
		for(int count=0;count<7;count++) {
			System.out.println("array["+count+"]="+array[count]);		
			}
		System.out.println("Length of array= "+array.length);
		

	}
	

}
