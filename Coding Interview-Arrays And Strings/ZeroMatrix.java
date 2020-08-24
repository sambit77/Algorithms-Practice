//make the rows and column all values of a cell to zero if any of the element is zero
//question 1.8
//Time Complexity O(m*n) | Space Complexity min(m,n)
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
		boolean zeroRows[] = new boolean[matrix.length];
		boolean zeroCols[] = new boolean[matrix[0].length];

		for(int i = 0 ; i < matrix.length ; i++)
		{
			for(int j = 0 ; j < matrix.length ; j++)
			{
				if(matrix[i][j] == 0)
				{
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}

		for(int i = 0 ; i < zeroRows.length ; i++)
		{
			if(zeroRows[i])
			{
				nullifyRow(matrix,i);
			}
		}
		for(int i = 0; i < zeroCols.length ; i++)
		{
			if(zeroCols[i])
			{
				nullifyCol(matrix,i);
			}
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
