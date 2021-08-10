class Stack{
	static int size = 5;
	int top;
	int arr[] = new int[size];
	
	// Checking Empty or not
	boolean isEmpty() {
		
		if(top<0)
			return true;
		else
			return false;
		
	}
	
	// Initializing Stack underflow
	
	Stack(){
		top = -1;
	}
	
	// Inserting into Stack
	
	boolean push(int x) {
		if(top>(size-1))
		{
			System.out.println("Stack is Full");
			return false;
		}
		else {
			arr[++top] = x;
			System.out.println("Element Inserted is :"+x);
			return true;
		}
	}
	
	// Pop Element
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Underflow");
			return 0;
		}
		
		else {
			int elem = arr[top--];
			return elem;
		}
	}
	
	
	
	
}



public class StackImplementation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack s = new Stack();
   
   s.push(5);
   s.push(3);
   s.push(7);
   
   System.out.println("Element pop is "+s.pop());
   
   
	}

}