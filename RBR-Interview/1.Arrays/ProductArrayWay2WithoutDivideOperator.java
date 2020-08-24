import java.util.Arrays;
//Time Complexity O(n^2) | Space Complexity O(1)

//Productarray[i] = product of all elements of array except current element
public class ProductArrayWay2WithoutDivideOperator 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,30,40};
		int[] productArray = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int leftProduct = getProduct(0,i-1,arr);
			int rightProduct = getProduct(i+1,arr.length-1,arr);
			
			productArray[i] = leftProduct * rightProduct;
		}
		
		System.out.println(Arrays.toString(productArray));
		
		
	}
	public static int getProduct(int start,int end,int[] arr)
	{
		if(start>arr.length)
		{
			return 1;
		}
		if(end<0)
		{
			return 1;
			
		}
		int total = 1;
		for(int i = start ; i <= end ; i++)
			total = total * arr[i];
		 return total;
	}

}
