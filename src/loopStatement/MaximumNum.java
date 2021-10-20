package loopStatement;

public class MaximumNum {

	public static void main(String[] args) {
		{
		  int [] Num= {122,299,12,34,56};
		  int highestNum=maximum(Num);
		  System.out.println("The maximum number are:"+highestNum);
		}
	}
	public static int maximum(int[] number)
	{
		int MaxNum= number[0];
		for(int num:number)
		{
			if(num>MaxNum)
			{
				MaxNum=num;
			}
		}
		return MaxNum;
	}

}
