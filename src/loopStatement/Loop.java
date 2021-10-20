package loopStatement;
import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a variable");
		int var=sc.nextInt();
		int i=0;
		while(i<=var)
		{
			int j=0;
			 while(j<=i)
			 {
				 ++j;
				 System.out.print(j+"\t");
			 }
			 i++;
			 System.out.println("");
		}

		
		
		System.out.println("Enter a variable");
		int var1=sc.nextInt();
		int k=0;
		while(k<=var1)
		{
			int l=k;
			 while(l<=var1)
			 {
				 ++l;
				 System.out.print("*\t");
			 }
			 k++;
			 System.out.println("");
		}
		
		System.out.println("Enter a variable");
		int var3=sc.nextInt();
		int m=1;
		while(m<=var3)
		{
			int n=1;
			 while(n<=var3)
			 {
			     n++;
			     for(int o=m;o<=var3;o++)
				 System.out.print("@\t");
			 }
			 m++;
			 System.out.println("");
		}

	}

}
