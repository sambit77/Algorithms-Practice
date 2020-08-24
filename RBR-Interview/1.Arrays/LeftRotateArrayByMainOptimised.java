import java.util.Arrays;
import java.util.Collections;
//Time complexity O(n) | Space Complexity O(1)
//Rotate the array of size n by d elements
public class LeftRotateArrayByMainOptimised
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,3,4,5,6};
		int d = 5;
		
		leftRotate(arr,d);
		
		System.out.println("Left Rotating by "+d+" gives ");
		System.out.println(Arrays.toString(arr));
		
		
	} 
	public static void leftRotate(int[] arr,int d)
	{
		d = d%arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}	
	public static void reverse(int[] arr,int start,int end)
	{
	  while(start<end)
	  {
		  int temp = arr[start];
		  arr[start] = arr[end];
		  arr[end] = temp;
		  start++;
		  end--;
	  }
	}

}
