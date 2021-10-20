package loopStatement;
import java.util.Scanner;
public class Miltiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter multiplication number");
		int mulNo=sc.nextInt();
		for(int number=1;number<=10;number++)
		{
			System.out.println((mulNo*number));
		}
		
		
	//using while loop
		
		System.out.println("Enter multiplication number");
		int mulNo1=sc.nextInt();
		int number=1;
		while(number<=10)
		{
			System.out.println((mulNo1*number));
			number++;
		}
		
    //using do while loop
		
		System.out.println("Enter multiplication number");
		int mulNo3=sc.nextInt();
		int number1=1;
		do
		{
			System.out.println((mulNo3*number1));
			number1++;
		}while(number1<=10);


	}

}
