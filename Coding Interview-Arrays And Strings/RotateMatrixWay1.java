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
		//Transpose of matrix
		for(int i = 0 ; i < matrix.length ; i++)
		{
			for(int j = i; j < matrix[i].length ; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]=temp;
			}
		}

		//reverse row wise
		for(int i = 0 ; i < matrix.length ; i++)
		{
			//reverse row i
			int left = 0;
			int right = matrix[i].length-1;
			while(left<right)
			{
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right]=temp;
				left++;
				right --;
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