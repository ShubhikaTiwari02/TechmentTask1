package Com.techment.day13.test;


class RepeatEnd{
	private String name;
	
	String RepeatImpl(String name,int limit)
	{
		String str = " ";
		int k=0;
		for(int i = limit;i<0;i--)
		{

               str=str+name.substring(name.length()-limit,name.length());
		}
			return str;
		
	}
	
}

public class ReapeatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RepeatFront reap = new RepeatFront();
		System.out.println("Hello  3 Chars is:-- " + reap.RepeatImpl("Hello", 4));
		System.out.println("Hello  2 Chars is:-- " + reap.RepeatImpl("Hello", 3));
		System.out.println("Hello  1 Chars is :--" + reap.RepeatImpl("Hello", 2));

		
		
	}

}


	