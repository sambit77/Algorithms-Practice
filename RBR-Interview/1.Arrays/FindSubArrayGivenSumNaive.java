//Time Complexity O(n^3) | Space Complexity O(1)
//Given an unsorted array A , find sub array which sums to given value X
public class FindSubArrayGivenSumNaive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {5,4,6,7,9,8,3,1,2};
		int X = 21;
		int sum = 0;
		
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				sum = generateSubArraySums(i,j,arr);
				if(sum == X)
				{
					System.out.println("Found "+sum);
					System.out.println("SubArrasy index  is");
					System.out.println("Starting index "+i);
					System.out.println("Ending index "+ j );
				}	
			}	
		}
	}
	public static int generateSubArraySums(int i , int j , int[] arr)
	{
		int sum = 0;
		for(int idx = i ; idx <= j ; idx++)
		{
			sum = sum + arr[idx];
		}
		return sum;
	}
	

}
