//Time Complexity O(n) | Space Complexity O(n)
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String st = "SambitPradhan";
		String reversed = reverseString(st);
		System.out.println("Reversed String is");
		System.out.println(reversed);
		
	}
	public static String reverseString(String st)
	{
		char[] crr = st.toCharArray();
		int left = 0;
		int right = st.length()-1;
		while(left < right)
		{
			char temp = crr[left];
			crr[left] = crr[right];
			crr[right] = temp;
			left++;
			right--;
			
		}
		return String.valueOf(crr);
		
	}

}
