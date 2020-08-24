//make the rows and column all values of a cell to zero if any of the element is zero
//question 1.8
//Time Complexity O(m*n) | Space Complexity O(1)
//m = row length and n = column length
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int [][]matrix = new int[][]{{1,2,3,4},
									  {5,6,7,8},
									  {9,0,2,3},
									  {0,1,2,4}};
		zeroMatrix(matrix);
		for(int[] a : matrix)
		{
			System.out.println(Arrays.toString(a));
		}


	}
	public static void zeroMatrix(int[][] matrix)
	{
		boolean firstRowZero = false;
		boolean firstColZero = false;

		for(int i = 0 ; i < matrix[0].length ; i++)
		{
			
				if(matrix[0][i] == 0)
				{
					firstRowZero = true;
					break;		
				}
			
		}
		for(int j = 0; j < matrix.length ; j++)
		{
			if(matrix[j][0]==0)
			{
				firstColZero=true;
				break;
			}
		}

		for(int i = 1 ; i < matrix.length ; i++)
		{
			for(int j = 1 ; j < matrix[0].length ; j++)
			{
				if(matrix[i][j] == 0)
				{
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for(int i = 1 ; i < matrix[0].length ; i++)
		{
			if(matrix[0][i] == 0)
			{
				nullifyCol(matrix,i);
			}
		}
		for(int j = 1 ; j < matrix.length ; j++)
		{
			if(matrix[j][0]==0)
			{
				nullifyRow(matrix,j);
			}
		}

		if(firstRowZero)
		{
				nullifyRow(matrix,0);
		}
		if(firstColZero)
		{
			nullifyCol(matrix,0);
		}
	}
	public static void nullifyRow(int[][] matrix,int row)
	{
		for(int i = 0 ; i < matrix.length ; i++)
		{
			matrix[row][i] = 0;
		}
	}
	public static void nullifyCol(int[][] matrix,int col)
	{
		for(int i = 0 ; i < matrix.length ;i++)
		{
			matrix[i][col] = 0;
		}
	}
}
