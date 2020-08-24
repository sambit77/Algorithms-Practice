import java.util.ArrayList;

//check whether given two strings are rotations of each other

//Time Complexity O(n) | Space Complexity O(n)
public class AreTwoStringsRotationsOfEachOtherTrickedOptimal 
{
	public static void main(String[] args) 
	{
		String s1 = "ravi";
		String s2 = "vira";
		
		boolean res = isRotations(s1,s2);
		
		System.out.println("Is s2 a rotaion of s1 "+res);
		
	}
	
	public static boolean isRotations(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		s1 = s1.concat(s1);
		
		return s1.indexOf(s2) == -1 ? false : true;
		
		
		
	}
	

}
