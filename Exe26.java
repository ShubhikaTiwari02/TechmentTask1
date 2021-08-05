import java.util.Random;

public class Exe26
{
  private int[] drawNum;
  private int[] yourNum; 
 private Random randomNumbers;
 
 
   public Drawing(int[] n)
   {
	  yourNum = new int[n.length];
	  
	  for (int index = 0; index < n.length; index++)
		 yourNum[index] = n[index];
   }
 


   public void getNumbers()
  {
	 Random random = new Random();
	 int[] drawNum = new int[5];
	 
		for (int i = 0; i < drawNum.length; i++){
			drawNum[i] = (int)(Math.random()*10);
			for (int j = 0; j < i; j++){
				if drawNum[i] == drawNum[j]){
				}
			}
			System.out.print(drawNum[i] + " ");
		}
		System.out.print("\n");
 }

  
   public int compareNumbers()
	{
		int count = 0;
		for(int j = 0; j < yourNum.length; j++)
		{
			for(int i = 0; i < drawNum.length; i++)
			{
				if(yourNum[i] == drawNum[i])
					count++;
			  yourNum[i] = 0;
			}
		}
		return count;
	}
}
