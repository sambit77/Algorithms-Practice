import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		//if number i is prime then res[i] is true
		boolean[] res = findPrimesInRange(100);
		print(res);
		
	}
	public static boolean[] findPrimesInRange(int num)
	{
		//to mark the nums as prime or not
		boolean[] res = new boolean[num+1];
		//set all flags to true other than 0 and 1
		for(int i = 2 ; i < res.length ; i++)
		{
			res[i]=true;
		}
		//start from thw prime number 2
		int prime = 2;
		//all the primes in a range are exisiting upto the square roor of num and rest
		//is multiple of that already found orimes

		while(prime <= num)
		{
			
			//mark all the mutiples of this prime as false
			markMultiplesOfPrime(prime,res);
			//get the next prime from the res boolean array
			prime = getNextPrime(prime,res);
		}
		//return the result
		return res;
	}
	//mark the multiples of prime as false
	public static void markMultiplesOfPrime(int prime,boolean[] res)
	{
		//start from prime * prime as othe numbers from prime to prime*prime would have been
		//crossed off in previous fuction calls

		//increment i by prime till the range to generate all multples of prime
		//and mark them as false;
		for(int i = prime*prime ; i < res.length ; i=i+prime)
		{

			res[i]=false;
		}
	}
	//get the next prime from the res boolean array 
	//i.e get the next index whoose value is true in range (prime,res.length)

	public static int getNextPrime(int prime,boolean[] res)
	{
		//start from element next to curret prime
		int next = prime+1;
		//while we are in bounds of array and didnt find a cell with true value
		//keep on incrementin the next pointer
		//to get the index od next prime whoose cell value is true
		while(next<res.length && !res[next])
		{
			next++;
		}

		//return the index / num which is prime
		return next;
	}
	public static void print(boolean[] res)
	{
		int i = 0;
		for(boolean b : res)
		{
			if(b)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}