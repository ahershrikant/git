package loopStatement;
import java.util.Scanner;
public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(count<=5)
		{
		System.out.println("Enter the radius of circle:");
           double Radius=sc.nextDouble();
           double Area=(((3.14)*Radius*Radius));
           System.out.println("The Area of Circle is:"+Area);
           System.out.println("\n");
           count++;
		}  
		

	}

}
