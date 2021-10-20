package loopStatement;
import java.util.Scanner;
public class Seriese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputNo=sc.nextInt();
		int [] a= new int[inputNo];
	
		for(int i=0;i<inputNo;i++)
		{
			a [i]=sc.nextInt();
			
		}
		int i=0;
		
			if((a[i]+a[i+1])==a[i+2])
			{
				System.out.println("The seriese is fibonaccie seriese");
			}
			else
			{
				System.out.println("The seriese is not fibonaccie seriese");
			}
	}

}
