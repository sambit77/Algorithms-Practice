//Time Complexity O(n^2) | Space Complexity O(1)
import java.util.ArrayList;
import java.util.Arrays;

//find 2 repeating elements in given array
//given n+2 elements 
//1 <= a[i] <= n
//all elements from 1 to n occur once except two numbers which occur two time 
public class TwoRepeatingElementsInArrayNaive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,3,5,4,3,2,1};
		
		Integer[] duplicates = getTwoRepeaters(arr);
		System.out.println("these 2 elements are repeating in array");
		System.out.println(Arrays.toString(duplicates));
		
	}
	public static Integer[] getTwoRepeaters(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					list.add(arr[i]);
				}
			}
		}
		return list.toArray(new Integer[list.size()]);
	}

}
