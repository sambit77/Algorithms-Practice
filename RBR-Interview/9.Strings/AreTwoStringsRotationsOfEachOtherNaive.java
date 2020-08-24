import java.util.ArrayList;

//check whether given two strings are rotations of each other

//Time Complexity O(n^2) | Space Complexity O(n)
public class AreTwoStringsRotationsOfEachOtherNaive 
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
		
		ArrayList<String> allRotationsOfS1 = new ArrayList<String>();
		int d = s1.length();
		
		for(int i = 0 ; i < d ; i++)
		{
			allRotationsOfS1.add(getAllRotations(s1.toCharArray(),i));
		}
		
		for(String rotaion : allRotationsOfS1)
		{
			if(rotaion.equals(s2))
			{
				return true;
			}
		}
		return false;
		
	}
	public static String getAllRotations(char[] s1,int d)
	{
		reverse(s1,0,d);
		reverse(s1,d+1,s1.length-1);
		reverse(s1,0,s1.length-1);
		
		return String.valueOf(s1);
		
	}
	public static void reverse(char[] st,int start , int end)
	{
		while(start<end)
		{
			char temp = st[start];
			st[start] = st[end];
			st[end] = temp;
			
			start++;
			end--;
			
		}
	}

}
