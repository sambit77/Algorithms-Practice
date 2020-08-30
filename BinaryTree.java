//All Binary Tree Basics in Java
//Creating a Binary Tree 
//TreeNode class Definition
//here the tree created is of this type
//    1
//   / \
//  2   3
//     / \
//    4
//     \
//      5

//Tree Traversals 
//Depth First Traversal
//Inorder Traversal (Both Recursion and Iteration)
//PreOrder Traversal (Both Recursion and Iteration)
//Post Order Traversal (Both Recursion and Iteration)

//Breadth First or Level Order Traversal
//1. Level Order Traversal (simple)
//2 Level Order Traversal with clear distiction of levels ( ArrayList of ArrayList)

import java.util.*;
public class BinaryTree
{
	class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	private TreeNode root;
	public  void createBinaryTree()
	{
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);

		root = first;
		first.left = second;
		first.right = third;
		third.left = fourth;
		fourth.right = fifth;
	}
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		//the tree is 
		//       1
		//      / \
		//     2   3
		//        /
		//       4
		//        \
		//         5
		System.out.println("Recursive way");
		System.out.println("Inorder");
		bt.inOrderRecursive(bt.root);
		System.out.println();
		System.out.println("Pre-Order");
		bt.preOrderRecursive(bt.root);
		System.out.println();
		System.out.println("Post Order");
		bt.postOrderRecursive(bt.root);
		System.out.println();
		System.out.println("Iterative Way");
		System.out.println();
		System.out.println("Inorder");
		bt.inOrderIterative(bt.root);
		System.out.println();
		System.out.println("pre order");
		bt.preOrderIterative(bt.root);
		System.out.println();
		System.out.println("post order");
		bt.postOrderIterative(bt.root);
		System.out.println();
		System.out.println("level order tarversal");
		bt.levelOrder(bt.root);
		System.out.println();
		System.out.println("levelOrder tarversal with level distiction");
		bt.levelOrderWithlevelDistiction(bt.root);

	}
	public void levelOrderWithlevelDistiction(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		bfs(q,list);
		for(ArrayList<Integer> level : list)
		{
			System.out.println(level.toString());
		}
	}
	public ArrayList<ArrayList<Integer>> bfs(Queue<TreeNode> level,ArrayList<ArrayList<Integer>> list)
	{
		Queue<TreeNode> next = new LinkedList<TreeNode>();
		ArrayList<Integer> levelElemets = new ArrayList<Integer>();
		while(!level.isEmpty())
		{
			TreeNode temp = level.poll();
			levelElemets.add(temp.data);

			if(temp.left != null)
			{
				next.add(temp.left);
			}
			if(temp.right != null)
			{
				next.add(temp.right);
			}

			if(level.isEmpty())
			{
				list.add(new ArrayList<Integer>(levelElemets));
				level.clear();
				bfs(next,list);
			}
		}
		return list;
	}

	public void levelOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}

	}
	public void postOrderIterative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		Stack<TreeNode> st = new Stack<TreeNode>();
		Stack<Integer> post = new Stack<Integer>();
		st.push(root);
		while(! st.isEmpty())
		{

			TreeNode temp = st.pop();
			post.push(temp.data);

			if(temp.left != null)
			{
				st.push(temp.left);
			}
			if(temp.right != null)
			{
				st.push(temp.right);

			}
			
			

		}
		while(!post.isEmpty())
		{
			System.out.print(post.pop()+" ");
		}
	}
	public void preOrderIterative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);
		while(!st.isEmpty())
		{
			TreeNode temp = st.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null)
			{
				st.push(temp.right);
			}
			if(temp.left != null)
			{
				st.push(temp.left);
			}
		}
	}
	public void inOrderIterative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode temp = root;
		while(!st.isEmpty() || temp != null)	
		{
			if(temp != null)
			{
				st.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = st.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}

	}
	public void postOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data+" ");
	}
	public void preOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}
	public void inOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrderRecursive(root.left);
		System.out.print(root.data+" ");
		inOrderRecursive(root.right);

	}
}