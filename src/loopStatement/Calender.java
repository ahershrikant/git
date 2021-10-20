package loopStatement;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a month");
	 String Month=sc.nextLine();
	// System.out.println(Month);
	
     String [] day= {"monday tuesday wensday thusday friday saturday sunday"};
     System.out.println(day[0]);
     for(int daysNo=1;daysNo<=31;daysNo++)
     {
    	 
    		 
    	 daysNo=sc.nextInt();
      
     }
    
    
	}

}
