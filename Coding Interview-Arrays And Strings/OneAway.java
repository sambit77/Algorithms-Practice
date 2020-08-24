//Question 1.5
//Time Complexity O(n) | Space Complexity O(1)
// n = length of shorter string
class A
{
	public static void main(String[] args) 
	{
		String s1 = "abe";
		String s2 = "ac";

		boolean res = checkIfOneEditAway(s1,s2);
		System.out.println("Check if one edit away"+res);
	}
	public static boolean checkIfOneEditAway(String s1,String s2)
	{
		if(s1.length() == s2.length())
		{
			return checkIfOneReplaceAway(s1,s2);
		}
		else if(s1.length()+1 == s2.length())
		{
			//check if s1 can be deleted in one position to make s2
			//that is the reverse of insertion i.e if s2 can be inserted one char to make s1
			return checkIfOneInsertAway(s1,s2);
		}
		else if(s1.length() == s2.length()+1)
		{
			//check if  one char can be inserted to s1 to make 1
			return checkIfOneInsertAway(s2,s1);
		}
		return false;
	}
	public static boolean checkIfOneReplaceAway(String s1,String s2)
	{
		boolean misMatchedOnce = false;
		for(int i = 0 ; i < s1.length() ; i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				if(misMatchedOnce)
				{
					return false;
				}
				misMatchedOnce = true;
			}
		}
		return true;
	}
	public static boolean checkIfOneInsertAway(String s1,String s2)
	{
		int idx1 = 0;
		int idx2 = 0;

		while(idx1 < s1.length() && idx2 < s2.length())
		{
			if(s1.charAt(idx1) != s2.charAt(idx2))
			{
				if(idx1 != idx2)
				{
					return false;
				}
				idx2++;
			}
			else
			{
				idx1++;
				idx2++;
			}
		}
		return true;
	}
}