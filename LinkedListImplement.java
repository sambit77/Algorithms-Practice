class Node<T>
{
	Node next = null;
	T data ;
	public Node(T data)
	{
		this.data = data;
	}
	public void appendToTail(T data)
	{
		Node newNode = new Node(data);
		Node n = this;
		while(n.next != null)
		{
			n=n.next;
		}
		n.next = newNode;
	}
	public void printList()
	{
		Node head = this;
		while(head != null)
		{
			System.out.print(head.data+"->");
			head = head.next;
		}
	}
}
class Main 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("List 1");
		Node<Integer> n = new Node(90);
		n.appendToTail(80);
		n.appendToTail(70);
		n.appendToTail(60);
		n.appendToTail(50);
		n.appendToTail(40);
		n.appendToTail(30);
		n.appendToTail(20);
		n.printList();
		System.out.println();
		System.out.println("List 2");

		Node<Character> nn = new Node('a');
		nn.appendToTail('b');
		nn.appendToTail('c');
		nn.appendToTail('d');
		nn.appendToTail('e');
		nn.appendToTail('f');
		nn.printList();


		
	}
}