//find the maximum occuring character in a string
//Time Complexity O(n^2) | Space Complexity O(1)
public class MaximumOccuringCharacterInStringNaive 
{
	public static void main(String[] args) 
	{
		String st = "ravindraa";
		char ch = getMaxOccuring(st);
		System.out.println("Maximum occured Character is "+ch);
		
		
	}
	public static char getMaxOccuring(String st)
	{
		int maxIdx = 0;
		int maxChar = -1;
		int count = 1;
		
		for(int i = 1 ; i < st.length() ; i++)
		{
			count=0;
			char ch = st.charAt(i);
			for(int j = i+1; j < st.length() ; j++)
			{
				if(ch == st.charAt(j))
				{
					count++;
				}
			}
			if(count>maxChar)
			{
				maxChar = count;
				maxIdx = i;
			}
		}
		return maxIdx == -1 ? null : st.charAt(maxIdx);
	}
	

}
