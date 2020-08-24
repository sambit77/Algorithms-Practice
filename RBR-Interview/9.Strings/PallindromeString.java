//Time Complexity O(n) | Space Complexity O(1)
public class PallindromeString 
{
	public static void main(String[] args) 
	{
		String st = "MADAM";
		boolean res = isPallindrome(st);
		
		System.out.println("Given String is Pallindrome "+res);
		
	}
	public static boolean isPallindrome(String st)
	{
		//one liner
		//return st.equals(new StringBuffer(st).reverse().toString());
		
		int left = 0 ;
		int right = st.length()-1;
		
		while(left < right)
		{
			if(st.charAt(left) != st.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
