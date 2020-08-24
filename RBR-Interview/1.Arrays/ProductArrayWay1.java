import java.util.*;
//Time Complexity O(n) | Space Complexity O(1)
//Productarray[i] = product of all elements of array except current element
public class ProductArrayWay1 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,30,40};
		int[] productArray = new int[arr.length];
		
		int totalProduct = 1;
		
		for(int i = 0 ;  i< arr.length ; i++)
		{
			totalProduct = totalProduct * arr[i];
		}
		for(int i = 0 ; i < productArray.length ; i++)
		{
			productArray[i] = totalProduct/arr[i];
		}
		System.out.println(Arrays.toString(productArray));
		
	}

}
