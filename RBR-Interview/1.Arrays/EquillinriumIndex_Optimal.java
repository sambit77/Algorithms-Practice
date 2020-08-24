//Time Complexity O(n)  Space Complexity O(1)
import java.util.Arrays;

public class EquillinriumIndex_Optimal
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,5,15,3,4,21,2};
		int[] leftSum = new int[arr.length];
		int[] rightSum = new int[arr.length];
		leftSum[0] = arr[0];
		
		for(int i = 1; i < arr.length ; i++)
		{
			leftSum[i] = leftSum[i-1]+arr[i];
		}
		//System.out.println(Arrays.toString(leftSum));
		rightSum[arr.length-1] = arr[arr.length-1];
		for(int i = arr.length - 2 ; i >= 0 ; i--)
		{
			rightSum[i] = rightSum[i+1]+arr[i];
		}
		//System.out.println(Arrays.toString(rightSum));
		
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			if(leftSum[i]==rightSum[i+1])
			{
				System.out.println("Equillibrium index is "+i);
			}
		}
		
		
		
	}

}
