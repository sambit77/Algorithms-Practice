import java.util.Arrays;
//Time Complexity O(n) | Space Complexity O(n)

//Given n non negative integers representing an elevation map,where width if each bar 
//is 1 find the amount of water that is trapped between them after raining
public class WaterArea 
{
	public static void main(String[] args) 
	{
		int[] heights = {1,0,2,0,1,0,3,1,0,2};
		
		int[] lefts = new int[heights.length];
		int[] rights = new int[heights.length];
		
		lefts[0] = heights[0];
		
		for(int i = 1; i < heights.length ; i++)
		{
			lefts[i] = Math.max(heights[i],lefts[i-1]);
		}
		System.out.println(Arrays.toString(lefts));
		rights[heights.length-1] = heights[heights.length-1];
		for(int i = heights.length-2 ; i >= 0; i--)
		{
			rights[i] = Math.max(heights[i], rights[i+1]);
		}
		System.out.println(Arrays.toString(rights));
		int area = 0;
		for(int i = 0 ; i < heights.length ; i++)
		{
			if(heights[i] < Math.min(lefts[i], rights[i]))
			area = area + (Math.min(lefts[i], rights[i])-heights[i]);
		}
		
		System.out.println("Watre trapped area is "+area);
		
	}

}
