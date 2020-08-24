//Time Complexity O(n) | Space Complexity O(1)
public class MaximumDifference_Optimal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[] {4,3,2,10,2,9,1,6};
		int maxDiff = getMaxDiff(arr);
		System.out.println(maxDiff);

	}
	public static int getMaxDiff(int[] arr)
	{
		int minSoFar = arr[0];
		int maxDiffSoFar =0;
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(minSoFar>arr[i])
			{
				minSoFar = arr[i];
			}
			else
			{
				if(arr[i]-minSoFar > maxDiffSoFar)
				{
					maxDiffSoFar = arr[i]-minSoFar;
				}
			}
			
		}
		return maxDiffSoFar;
	}

}
