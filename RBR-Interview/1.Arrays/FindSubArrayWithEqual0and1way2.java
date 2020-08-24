import java.util.Arrays;

//Time Complexity O(n^2) | Space Complexity O(n)

//Find Largest subarray with equal 0 and 1
//here we use 1s and 0s soFar Array
public class FindSubArrayWithEqual0and1way2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0};
		
		int[] zeroSoFar = new int[arr.length];
		int[] oneSoFar = new int[arr.length];
		
		int[] maxIndex = new int[2];
		maxIndex[0] = -1;
		maxIndex[1] = -1;
		
		if(arr[0]==1)
		{
			oneSoFar[0] = 1;
			zeroSoFar[0] = 0;
		}
		else
		{
			oneSoFar[0]=0;
			zeroSoFar[0]=1;
		}
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i] == 0)
			{
				zeroSoFar[i] = zeroSoFar[i-1]+1;
				oneSoFar[i] = oneSoFar[i-1];
			}
			else
			{
				zeroSoFar[i] = zeroSoFar[i-1];
				oneSoFar[i] = oneSoFar[i-1]+1;
			}
			
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(oneSoFar));
		//System.out.println(Arrays.toString(zeroSoFar));
		
		//generate all subArray and get their count of 0 and 1 in O(1)
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				int count = getOneZeroCount(i,j,oneSoFar,zeroSoFar);
				if(count == 0)
				{
					if(maxIndex[1]-maxIndex[0]<j-i)
					{
						maxIndex[1]=j;
						maxIndex[0]=i;
					}
				}
			}
		}
		System.out.println("Subarray with equal 0 and 1 is");
		System.out.println(Arrays.toString(maxIndex));
		
	}
	public static int getOneZeroCount(int i , int j , int[] one,int[] zero)
	{
		int ones = 0;
		int zeros = 0;
		if(i==0)
		{
			return one[j]-zero[i];
		
		}
		ones = Math.abs(one[j]-one[i-1]);
		zeros = Math.abs(zero[j]-zero[i-1]);
		
		return ones-zeros;
	}
	

}
