package Com.techment.day13.test;

class RepeatFront{
	private String name;
	
	String RepeatImpl(String name,int limit)
	{
		String str = " ";
		int k=0;
		for(int i = limit;i>=0;i--)
		{

               str= str+name.substring(k,i);
		}
			return str;
		
	}
	
}
public class RepeatForntData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RepeatFront rep = new RepeatFront();
		System.out.println("Chcolate  4 Charecters " + rep.RepeatImpl("Chocolate", 4));
		System.out.println("Chcolate  3 Charecters  " + rep.RepeatImpl("Chocolate", 3));
		System.out.println("Chcolate  2 Charecters  " + rep.RepeatImpl("Chocolate", 2));
		System.out.println("Chcolate  1 Charecters  " + rep.RepeatImpl("Chocolate", 1));

	}

}


	