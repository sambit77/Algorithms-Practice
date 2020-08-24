//Time Complexity O(n) | Space Complexity O(n-k+1)
import java.util.Arrays;

//Given an array and an integer k , find the maximum for each and every contigious 
//sub array of size k
public class ContigiousSubArraySizeK 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,4,2,11,3,15,12,8,7,9,21,14};
		int k = 3;
		
		int[] maxEleInSubArrays = getMaxEleInSubArrays(arr,k);
		System.out.println(Arrays.toString(maxEleInSubArrays));
		
	}
	public static int[] getMaxEleInSubArrays(int[] arr,int k)
	{
		int[] res = new int[arr.length-2];
		
		for(int i = 0 ; i < arr.length-2 ; i++)
		{
			res[i] = Math.max(arr[i],arr[i+1]);
			res[i] = Math.max(res[i],arr[i+2]);
		}
		
		return res;
	}
	

}
