import java.util.Arrays;
//Time Complexity O(n log n) | Space Complexity O(1)
//sort an array in wave form
//wave form means a[0]>=a[1]<=a[2]>=a[3] ..... .. 
public class WaveLikeSortingNaive 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,8,7,2,6,3,5,4};
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length-1 ; i = i+2)
		{
			swap(i,i+1,arr);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	public static void swap(int i ,int j ,int[] arr)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	

}
