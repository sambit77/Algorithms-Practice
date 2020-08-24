//Time Compelxity O(n^2) | Space Complexity O(1)
import java.util.*;
class A 
{
	public static void main(String[] args) 
	{
		int matrix[][] = new int[][]{{1,2,3,4},
									{5,6,7,8},
									{9,10,11,12},
									{13,14,15,16}};
	    print(matrix);
	    System.out.println("------------");
	    rotateRightBy90(matrix);
	    print(matrix);
		
	}
	public static void rotateRightBy90(int[][] matrix)
	{
		int n = matrix.length;
		for(int layer = 0 ; layer < n/2 ; layer++)
		{
			int first = layer;
			int last = n-1-layer;

			for(int i = first ; i < last ; i++)
			{
				int offset = i-first;
				int top = matrix[first][i];//save top
				//left->top
				matrix[first][i] = matrix[last-offset][first];
				// bottom -> left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right->bottom
				matrix[last][last-offset] = matrix[i][last];
				//top->right
				matrix[i][last]=top; //right <- saved top

			}
		}

	}
	public static void print(int[][] m)
	{
		for(int[] a : m)
		{
			System.out.println(Arrays.toString(a));
		}
	}
}
