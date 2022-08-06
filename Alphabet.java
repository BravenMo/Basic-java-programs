package student;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int len=a.length();
		char ch=sc.next().charAt(0);
		String news="";
		String x="";
		String y="";
		for(int i=0;i<len;i++) {
			char k=a.charAt(i);
			if(ch==k) {
				String chh=""+k;
				x=a.substring(0,i);
				y=a.substring(i+1);
				news=x+chh.toUpperCase()+y;
				break;
			}
		}
		System.out.println(news);
		System.out.println(x);
		System.out.println(y);
	}
}
