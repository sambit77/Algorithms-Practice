//Time Complexity O(n^2) Space Complexity O(1)
//n = no of rows in the array
public class RotateSquareMatrixBy90DegreeLeft 
{
	public static void main(String[] args) 
	{
		int[][] square = new int[4][4];
		
		int input = 1;
		for(int i = 0; i < square.length ; i++)
		{
			for(int  j = 0 ; j < square.length ; j++)
			{
				square[i][j] = input;
				input++;
			}
		}
		System.out.println("The Original Square Matrix is ");
		for(int i = 0; i < square.length ; i++)
		{
			for(int  j = 0 ; j < square.length ; j++)
			{
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
		
		//reversing the rows of array 
		for(int i = 0 ; i< square.length ; i++)
		{
			for(int j = 0 , k = square.length-1; j < k ; j++ , k--)
			{
				int temp = square[i][k];
				square[i][k] = square[i][j];
				square[i][j] = temp;
				
			}
		}
		//find the transpose of matrix then
		for(int i = 0 ; i < square.length ; i++)
		{
			for(int j = i ; j<square.length ; j++ )
			{
				int temp = square[i][j];
				square[i][j] = square[j][i];
				square[j][i] = temp;
			}
		}
		System.out.println("After 90 degree left rotation ");
		for(int i = 0; i < square.length ; i++)
		{
			for(int  j = 0 ; j < square.length ; j++)
			{
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
	

}
