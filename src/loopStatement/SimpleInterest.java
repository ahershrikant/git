package loopStatement;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int count=1;
	   while(count<=3)
	   {
	   System.out.println("Enter The initial principle:");
	   int p=sc.nextInt();
	   System.out.println("Enter The Rate of interest in %:");
	   int R=sc.nextInt();
	   System.out.println("Enter The Time:");
	   int T=sc.nextInt();
        int I=(p*R*T/100);
	   System.out.println("The simple interest is:"+I);
	   System.out.println("\n");
	   count++;
	   }
	   
         
	}

}
