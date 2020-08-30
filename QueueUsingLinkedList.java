import java.util.*;
class MyQueue<T>
{
	public static class QueueNode<T>
	{
		private T data;
		private QueueNode<T> next;
		public QueueNode(T data)
		{
			this.data = data;
		}
	}
	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T data)
	{
		//add to the end of the queue
		QueueNode<T> node = new QueueNode<T>(data);
		if(last != null)
		{
			last.next = node;
		}
		last = node;
		if(first == null)
		{
			first = last;
		}
	}
	public T remove() throws Exception
	{
		//remove from head od the queue
		if(first == null)
		{
			throw new Exception();
		}
		T data = first.data;
		first = first.next;
		if(first == null)
		{
			last = null;
		}
		return data;
	}
	public T peek() throws Exception
	{
		if(first == null)
		{
			throw new Exception();
		}
		return first.data;
	}
	public boolean isEmpty()
	{
		return first == null;
	}
	public static void main(String[] args) throws Exception
	{
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.add(2);
		q.add(5);
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		
	}
}