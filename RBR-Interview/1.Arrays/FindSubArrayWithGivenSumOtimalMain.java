//Time Complexity O(n) | Space Complexity O(1)
import java.util.Arrays;
import java.util.HashMap;


//given an array of n integers (both positive and negative)
//find the subarray that sums to given sum
public class FindSubArrayWithGivenSumOtimalMain 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {8,5,-2,3,4,-5,7};
		int x = 0;
		int[] sumsUpTo = new int[arr.length];
		sumsUpTo[0] = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			sumsUpTo[i] = sumsUpTo[i-1]+arr[i];
		}
		
		System.out.println(Arrays.toString(sumsUpTo));
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < sumsUpTo.length ; i++)
		{
			if(map.containsKey(sumsUpTo[i]))
			{
				System.out.println("Sub Array Found ");
				System.out.println("Start Index "+(map.get(sumsUpTo[i])+1));
				System.out.println("End index "+i);
			}
			else
			{
				map.put(sumsUpTo[i],i);
				
			}
			
			
		}
		
	}

}
