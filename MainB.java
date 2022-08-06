package student;
import java.util.Scanner;
class Main{
    
    String[] pn;
    int[] price;
    
    void store(int n){
    	pn=new String[n];
    	price=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
        	String s=sc.nextLine();
            int l=s.length();
            for(int j=0;j<l;j++) {
            	char k=s.charAt(j);
            	if(k==' ') {
            		pn[i]=s.substring(0,j);
            		price[i]=Integer.valueOf(s.substring(j+1));
            	}
            }
            System.out.println(pn[i]);
            System.out.println(price[i]);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m[]=new Main[2];
        m[0]=new Main();
        m[1]=new Main();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        m[0].store(n1);
        m[1].store(n2);
        String[] newpn=new String[n1+n2];
        int[] newp=new int[n1+n2];
        int count=0;
        int flag=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                String s=m[0].pn[i];
                System.out.println(m[1].pn[j]);
                if(s==m[1].pn[j]){
                    newpn[count]=s;
                    if(m[0].price[i]>m[1].price[j]){
                        newp[count]=m[0].price[i];
                    }
                    else{
                        newp[count]=m[1].price[j];
                    }
                    count=count+1;
                    flag=1;
                }
            }
            if(flag==0) {
            	newpn[count]=m[0].pn[i];
            	newp[count]=m[0].price[i];
            	count=count+1;
            	flag=0;
            }
        }
        for(int k=0;k<=count;k++){
            System.out.print(newpn[k]+" ");
            System.out.println(newp[k]);
        }
    }
}