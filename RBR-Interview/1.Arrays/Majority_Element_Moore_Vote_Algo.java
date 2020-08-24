//given an unsorted array find the element that occurs more than n/2 times in
//the array , n = size of array
//Time Complexity O(n) | Space Complexity O(1)
public class Majority_Element_Moore_Vote_Algo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,1,1,1,2,3,4};
		int potentailMajorityELement = getMajorityElement(arr);
		
		if(isMajorityElement(potentailMajorityELement,arr))
		{
			System.out.println("Majority element in array is");
			System.out.println(potentailMajorityELement);
		}

	}
	public static boolean isMajorityElement(int ele,int[] arr)
	{
		int count = 0;
		for(int num : arr)
		{
			if(ele == num )
			{
				count++;
			}
		}
		return count >= arr.length/2 ;
	}
	public static int getMajorityElement(int[] arr)
	{	
		int voterIdx = 0;
		int votes = 1;
		
		for(int i = 1; i < arr.length ; i++)
		{
			if(arr[voterIdx] == arr[i])
			{
				votes++;
			}
			else
			{
				votes--;
			}
			if(votes==0)
			{
				voterIdx = i;
				votes = 1;
			}
		}

		
		
		
		return arr[voterIdx];
	}

}
