import java.util.Arrays;
//Time Complexity O(nd) at max it can rise to O(n^2)
//Space Complexity O(1)
//Rotate the array of size n by d elements
public class LeftRotateArrayBydUsingTempVariableOndTime 
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
		int temp = 0;
		while(d>0)
		{
			temp = arr[0];
			
			for(int i = 1 ; i < arr.length ; i++)
			{
				arr[i-1] = arr[i];
				
			}
			arr[arr.length-1] = temp;
			d--;
		}
		
	}
	

}
