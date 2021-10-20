package loopStatement;
import java.util.Scanner;
public class StringRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
        char[] inputName=name.toCharArray();
        int left,right;
        right=inputName.length-1;
       /* for(int input=inputName.length-1;input>=0;input--)
        {
        	  System.out.println(inputName[input]);
        }*/
        for(left=0;left<right;left++,right--)
        {
        	char temp=inputName[left];
        	inputName[left]=inputName[right];
        	inputName[right]=temp;
        }
        System.out.println("The revers String is:");
        for(char c:inputName)
        {
        
        	System.out.print(c);
        	
        }
	   }
       }  


				
			
		
	


