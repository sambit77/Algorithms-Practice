import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(1)
//find 2 repeating elements in array
//given n+2 elements
//1 <= a[i] <= n 
//all elements from 1 to n occur once except two elements which occur twice
public class TwoRepeatingElementsInArraySumOfNNaturalsWay
{
	public static void main(String[] args) 
	{
	
		int[] arr = new int[] {1,2,1,3,4,5,3};
		
		Integer[] duplicates = getTwoRepeaters(arr);
		
		System.out.println("Duplicates are");
		System.out.println(Arrays.toString(duplicates));

	}
	public static Integer[] getTwoRepeaters(int[] arr)
	{
		int n = arr.length-2;
		
		int nsums = n*(n+1)/2;
		int nproducts = factorial(n);
		int arrsum = 0;
		int arrproduct = 1;
		for(int num : arr)
		{
			arrsum = arrsum+num;
			arrproduct = arrproduct*num;
		}
		int xysums = arrsum - nsums;
		int xyproduct = arrproduct/nproducts;
		
		//x-y
		
		int xydiff = (int) Math.sqrt((xysums*xysums)-(4*xyproduct));
		
		// x = x+y + x-y
		
		int x = (xysums+xydiff)/2;
		int y = (xysums-xydiff)/2;
		
		return new Integer[] {x,y};
		
	}
	public static int factorial(int n)
	{
		int res = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			res = res * i;
		}
		//System.out.println("Factorial is"+res);
		return res;
	}

}
