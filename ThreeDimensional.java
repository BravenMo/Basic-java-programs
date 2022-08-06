package programming;
import java.util.*;


public class ThreeDimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[3][4][2];
		int count=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<2;k++) {
					arr[i][j][k]=count;
					count++;
				}
			}
		}
		
		for(int x=0;x<3;x++) {
			for(int y=0;y<4;y++) {
				for(int z=0;z<2;z++) {
					System.out.print(arr[x][y][z]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
