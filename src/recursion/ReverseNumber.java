package recursion;

public class ReverseNumber {

	static int reverse(int x, int rev) {
		if(x == 0) {
			return rev;
		}
		
		return reverse(x/10, rev*10 + x%10);
	}
	
	static int tailRecursion(int x) {
		if(x < 10) {
			return x;
		}
		
		int val = tailRecursion(x/10);
		int pow = (int) Math.pow(10, String.valueOf(x).length() - 1);
		return (pow * (x%10)) + val;
	}
	
	static int rev2(int n) {
		int digits = (int)(Math.log10(n));
		return helper(n, digits);
	}
	
	static int helper(int n, int digits) {
		if(n < 10) {
			return n;
		}
		
		return (int) (n%10 * Math.pow(10, digits - 1) + helper(n/10, digits - 1));
	}
	 
	public static void main(String[] args) {
		System.out.println(reverse(123, 0));
		System.out.println(tailRecursion(30165));
	}

}
