//Question 1.4
//Time Complexity O(n) | Space Complexity O(1)
//n = length of input string
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "abeb";
		boolean res = canPermutedToPallindrome(st);
		System.out.println(res);
		//System.out.println(Character.getNumericValue('a')); // a has a numeric value 10,b = 11..


		
	}
	public static boolean canPermutedToPallindrome(String st)
	{
		int bitvector = 0;
		for(int i = 0 ; i < st.length() ; i++)
		{
           int idxToToggle = Character.getNumericValue(st.charAt(i));
           bitvector = toggleIthBit(bitvector,idxToToggle);
		}
		return bitvector == 0 || checkIfExactOneBitIsSet(bitvector);

	}
	public static int toggleIthBit(int bitvector,int i)
	{
		if(i < 0)
		{
			return bitvector;
		}
		int mask = 1 << i;

		bitvector = bitvector ^ mask;
		return bitvector;
	}
	public static boolean checkIfExactOneBitIsSet(int bitvector)
	{
		return ((bitvector-1)&bitvector)==0;
	}
}
		