package student;
import java.util.Scanner;
class VIT{
    
    long phonenumber;
    String contactname;
    final String copyright="This contact belongs to VIT";
    
    VIT(long p,String c){
        phonenumber=p;
        contactname=c;
    }
    
    void display(){
        System.out.println("VIT contacts database");
    }

}
class EmpContact extends VIT{
    
    int extensioncode;
    
    EmpContact(long p,String c,int ex){
        super(p,c);
        extensioncode=ex;    
    }
    
    void display(){
        System.out.println("The phone number of "+contactname+" is "+phonenumber+".Extension code is "+extensioncode);
        super.display();
    }
    
}
class VitPh{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long p=sc.nextLong();
		String n=sc.next();
		int e=sc.nextInt();
		VIT v1=new VIT(p,n);
		v1.display();
		EmpContact v2=new EmpContact(p,n,e);
		v2.display();
	}
}
