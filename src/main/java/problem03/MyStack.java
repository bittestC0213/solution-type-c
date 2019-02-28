package problem03;

public class MyStack {
	
	private String[] buffer;
	private int top;

	public MyStack( int size ) {
		buffer = new String[size];
		top = 0;
	}

	public void push(String item) {
		if(size()==buffer.length)
		{
			resize(2*buffer.length);
		}
		buffer[top] = item;
		top++;
	}

	public String pop() {

		try
		{
		if(size()==0)
		{
			resize(buffer.length/2);
		}
		top--;
		return buffer[top];
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public boolean isEmpty() {
		if(size()==0)
			return true;
		return false;
	}
	
	public int size() {
		return (top);
	}
	//------------------------------------------------------

	
	public void resize(int capacity)
	{
		String[] copy = new String[capacity];
		for(int i=0;i<buffer.length;i++)
		{
			copy[i] = buffer[i];
		}
		buffer = copy;
	}

}