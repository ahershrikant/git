package loopStatement;
import java.util.Scanner;
public class PrintMaxMarck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Mark:");
		int [] Mark=new int[7];
		for(int j=0;j<6;j++) 
		
	      Mark [j]=sc.nextInt();
		
		 System.out.println("The mark are:");
		 for(int j=0;j<6;j++) 
		 {
		 System.out.print(Mark[j]+"\t");
		 
		 }
		 int highest_Mark= maxMark(Mark);
		 System.out.println("\nThe highest mark is:"+highest_Mark);
	}
	public static int maxMark(int[] number)	
	{
	      int max=number[0];
	    for(int Num:number)
	    	if(Num>max)
	    	{
	    		max=Num;
	    	}
	
		return max;
	
      }
		
 }
	    
	    
		


	


