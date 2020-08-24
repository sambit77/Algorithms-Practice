//find begining index of 1
public class FindIndexOf1InUnknowSizeArray 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,1,0};
		
		int left = 0;
		int right = 0;
		int i = 0;
		while(true)
		{
			if(arr[i]==1)
			{
				right = i;
				break;
			}
			left = i;
			i++;
			
			
		}
		System.out.println(left);
		System.out.println(right);
		
	}
	

}
