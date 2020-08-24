//given n integers find no of triangles possible by takin those int as sides of triangle
//Time Complexity O(n^3) | Space Complexity O(1)

public class NoOfPossibleTrianglesNaive 
{
	public static void main(String[] args) 
	{
		int[] sides = new int[] {6,7,8,10,12,14,50};
		
		int count = 0;
		
		for(int i = 0 ; i < sides.length ; i++)
		{
			for(int j = i+1; j <sides.length ; j++)
			{
				for(int k = j+1 ; k < sides.length ; k++)
				{
					if(isTriangle(sides[i],sides[j],sides[k]))
					{
						count++;
					}
				}
			}
		}
		
		System.out.println("Number Of Triangles Possible "+count);
		
	}
	public static boolean isTriangle(int a,int b,int c)
	{
		return a+b > c && a+c > b && b+c >a;
	}

}
