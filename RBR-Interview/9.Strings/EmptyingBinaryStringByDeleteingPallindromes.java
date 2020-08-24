//Minimum Number Of Pallindromic subsequences to be removed to empty a binary String

public class EmptyingBinaryStringByDeleteingPallindromes 
{
	public static void main(String[] args) 
	{
	  String binary = "101101101101";
	  int minDeletes = getMinimumDeletions(binary);
	  System.out.println(minDeletes);
	  
	}
	public static int getMinimumDeletions(String binary)
	{
		if(isPallindrome(binary))
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	public static boolean isPallindrome(String str)
	{
		return str.equals(new StringBuffer(str).reverse().toString());
	}
	

}
