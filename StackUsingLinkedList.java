class MyStack<T>
{
	public static class StackNode<T>
	{
		private T data;
		private StackNode<T> next;
		private StackNode(T data)
		{
			this.data = data;
		}

	}
	
	public StackNode top ;
	public void push(T data)
	{
		StackNode<T> node  = new StackNode(data);
		node.next = top;
		top = node;
	}
	public T pop() throws Exception
	{
		if(top == null)
		{
			throw new Exception();
		}
		else
		{
			StackNode res = top;
			top = top.next;
			return (T)res.data;
		}
	}
	public T peek() throws Exception
	{
		if(top == null)
		{
			throw new Exception();
		}
		else
		{
			return (T)top.data;
		}
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public static void main(String[] args) throws Exception
	{
		MyStack<Integer> st = new MyStack<Integer>();
		st.push(5);
		st.push(6);
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		//System.out.println(st.pop());
		//System.out.println(st.isEmpty());
	}
}