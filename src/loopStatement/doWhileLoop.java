package loopStatement;

import java.util.Scanner;


public class doWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a variable");
		int var3=sc.nextInt();
		int m=1;
		do
		{
			int n=1;
			 do
			 {
			     
			     for(int o=m;o<=var3;o++)
			     {
				    System.out.print("*\t");
				    
			     }
			     n++;
			 } while(n<=var3);
			 
			 System.out.println("");
			 m++;
		}while(m<=var3);

	}

}
