import java.util.Arrays;

//given n integers find no of triangles possible by takin those int as sides of triangle
//Time Complexity O(n log n) | Space Compelxity O(1)
public class NoOfPossibleTrianglesOptimal 
{
	public static void main(String[] args) 
	{
		int[] sides = new int[] {7,8,6,14,10,12,50};
		//first sort the sides array
		Arrays.sort(sides);
		int count = 0;
		
		for(int i = 0 ; i < sides.length-2 ; i++)
		{
		    int k = i+2;
		    for(int j = i+1 ; j < sides.length-1 ; j++)
		    {
		    	while(k<sides.length && sides[i]+sides[j]>sides[k])
		    	{
		    		k++;
		    	}
		    	count = count+k-j-1;
		    }
		}
		System.out.println("Number of possible tringles is"+count);
		
	}

}
