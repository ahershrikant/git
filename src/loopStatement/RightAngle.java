package loopStatement;

import java.util.Scanner;

public class RightAngle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputNo=sc.nextInt();
		for(int start=1;start<=inputNo;start++)
		{
			for(int space=1;space<=inputNo-start;space++)
			
				System.out.print(" ");
			
			for(int space=1;space<=start;space++)
			
				System.out.print("*");
		
			
			System.out.println("");
		}

	}

}
