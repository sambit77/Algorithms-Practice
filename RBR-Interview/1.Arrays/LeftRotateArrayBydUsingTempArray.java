import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(d)
//Rotate the array of size n by d elements
public class LeftRotateArrayBydUsingTempArray
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,3,4,5,6};
		int d = 7;
		
		leftRotate(arr,d);
		
		System.out.println("Left Rotating by "+d+" gives ");
		System.out.println(Arrays.toString(arr));
		
		
	} 
	public static void leftRotate(int[] arr,int d)
	{
		d = d % arr.length;
		int[] temp = new int[d];
		
		for(int i = 0 ; i < d ; i++)
		{
			temp[i] = arr[i];
		}
		
		for(int i = d ; i < arr.length ; i++)
		{
			arr[i-d] = arr[i];
		}
		int j = temp.length-1;
		for(int i = arr.length-1 ; i >=arr.length-d  ; i--)
		{
			arr[i] = temp[j];
			j--;
		}
	}

}
