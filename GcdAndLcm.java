import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int gcd = getGCD(a,b);
		int lcm = (a*b)/gcd;
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("--------------");
		System.out.println("GCD(a,b)"+gcd);
		System.out.println("LCM(a,b)"+lcm);
		
	}
	public static int getGCD(int x,int y)
	{
		if(y==0)
		{
			return x;
		}
		return getGCD(y,x%y);
	}
}