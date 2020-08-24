import java.util.Arrays;
import java.util.HashMap;
//Time Complexity O(n) | Space Complexity O(n)
//Find MAx SubArray with equal no of 0 and 1
public class FindSubArrayWithEqual0and1OptimalMain 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0};
		
		int[] sumsUpTo = new int[arr.length];
		
		sumsUpTo[0] = arr[0] == 0 ? -1 : 1;
		
		for(int i = 1; i < sumsUpTo.length ; i++)
		{
			sumsUpTo[i] = sumsUpTo[i-1]+(arr[i]==0?-1:1);
		}
		System.out.println(Arrays.toString(sumsUpTo));
		int[] maxIndex = new int[2];
		maxIndex[0] = -1;
		maxIndex[1] = -1;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < sumsUpTo.length ; i++)
		{
			if(sumsUpTo[i]==0)
			{
				maxIndex[0]=0;
				maxIndex[1]=i;
				continue;
			}
			
			if(map.containsKey(sumsUpTo[i]))
			{
				if(maxIndex[1]-maxIndex[0]<i-map.get(sumsUpTo[i]))
				{
					maxIndex[0] = map.get(sumsUpTo[i])+1;
					maxIndex[1] = i;
					
				}
			}
			else
			{
				map.put(sumsUpTo[i],i);
			}
			
		}
		System.out.println(Arrays.toString(maxIndex));
		
	}

}
