package loopStatement;
import java.util.Scanner;
public class trangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a variable");
		int var=sc.nextInt();
		int i=1;
		while(i<=var)
		{
			int j=i;
			 while(j<=var)
			 {
				 j++;
				 System.out.print("*\t");
			 }
			// System.out.print("*\t");
			 i++;
			 System.out.println("");
		}

      for(int num1=1;num1<=20;num1++)
      {
    	  for(int num2=1;num2<=20;num2++)
    		  System.out.print("\t"+(num1*num2));
		  System.out.print("\n");
      }
	}

}
