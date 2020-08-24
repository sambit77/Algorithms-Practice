import java.util.Arrays;

//Productarray[i] = product of all elements of array except current element
public class ProductArrayway3WithoutDivideOperatorExtraSpace 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,30,40};
		int[] productArray = new int[arr.length];
		
		int[] leftProduct = new int[arr.length];
		int[] rightProduct = new int[arr.length];
		
		leftProduct[0] = arr[0];
		rightProduct[arr.length-1] = arr[arr.length-1];
		
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			leftProduct[i] = leftProduct[i-1]*arr[i];
		}
		
		for(int i = arr.length-2 ; i >= 0 ; i--)
		{
			rightProduct[i] = rightProduct[i+1]*arr[i];
		}
		
		System.out.println(Arrays.toString(leftProduct));
		System.out.println(Arrays.toString(rightProduct));
		
		productArray[0] = rightProduct[1];
		productArray[arr.length-1] = leftProduct[arr.length-2];
		for(int i = 1 ; i < productArray.length-1 ; i++)
		{
			productArray[i] = leftProduct[i-1]*rightProduct[i+1];
		}
		System.out.println(Arrays.toString(productArray));
		
		
		
	}

}
