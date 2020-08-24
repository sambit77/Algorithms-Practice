import java.util.ArrayList;
import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(n)

//find 2 repeating elements in array
//given n+2 elements
//1 <= a[i] <= n 
//all elements from 1 to n occur once except two elements which occur twice
public class TwoRepeatingElementsInArrayBooleanVisitedWay 
{
	public static void main(String[] args) 
	{
	
		int[] arr = new int[] {1,3,2,4,3,2};
		
		Integer[] duplicates = getTwoRepeaters(arr);
		
		System.out.println("Duplicates are");
		System.out.println(Arrays.toString(duplicates));

	}
	public static Integer[] getTwoRepeaters(int[] arr)
	{
		ArrayList<Integer> list =  new ArrayList<Integer>();
		int[] visited = new int[arr.length-2];
		
		for(int num : arr)
		{
			visited[num-1] =  visited[num-1]+1;
		}
		
		for(int i = 0 ; i < visited.length ; i++)
		{
			if(visited[i]>1)
			{
				list.add(i+1);
			}
		}
		
		return list.toArray(new Integer[2]);
	}
	
}
