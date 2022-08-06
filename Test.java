package student;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of mystery books ");
        int b=sc.nextInt();
        System.out.println("Enter number of humor books ");
        int bb=sc.nextInt();
        Books b1[]=new Books[b];
        Books b2[]=new Books[bb];
        for(int i=0;i<b;i++){
            System.out.println("Enter parameters for mystery book "+i);
            String s=sc.next();
            String a=sc.next();
            String g=sc.next();
            int p=sc.nextInt();
            b1[i]=new Books(s,a,g,p);
        }
        for(int j=0;j<bb;j++){
            System.out.println("Enter parameters for humor book "+j);
            String s=sc.next();
            String a=sc.next();
            String g=sc.next();
            int p=sc.nextInt();
            b2[j]=new Books(s,a,g,p);
        }
        System.out.println("Mystery books are: ");
        for(int k=0;k<b;k++){
            System.out.println("Book "+(k+1)+": ");
            System.out.println(b1[k].title+" "+b1[k].author+" "+b1[k].genres+" "+b1[k].price);
        }
        System.out.println("Humor books are: ");
        for(int l=0;l<bb;l++){
            System.out.println("Book "+(l+1)+": ");
            System.out.println(b2[l].title+" "+b2[l].author+" "+b2[l].genres+" "+b2[l].price);
        }
    }
}

