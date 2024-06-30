package recursion;

public class PalindromeForNumber {
	
	static int isPalindrome(int num, int dubNum) throws Exception {
		
		if(num == 0) {
			return dubNum;
		}
		
		dubNum = isPalindrome(num/10, dubNum);
		
		if(num%10 != dubNum%10) {
			throw new Exception();
		}
		
		return dubNum / 10;	
	}
	
	static int getDivisor(int num) {
		int divisor = 1;
		while(num/divisor >= 10) {
			divisor *= 10;
		}
		return divisor;
	}
	
	static boolean palindromeWithoutExtraSpace(int num) {
		
		int divisor = getDivisor(num);
		
		while(divisor > 1) {
			
			int start = num / divisor;
			int end = num % 10;
			
			if(start != end) {
				return false;
			}
			
			num = (num % divisor) / 10;
			divisor /= 100;
		}
		
		return true;
	}

	
	static boolean palindromeWithoutExtraSpaceWithRecursion(int num, int divisor) {
		
		if(divisor <= 1) {
			return true;
		}
		
		if(num % 10 != num / divisor) {
			return false;
		}
		
		return palindromeWithoutExtraSpaceWithRecursion((num % divisor) / 10, divisor/100);
	}
	
	
	public static void main(String[] args) {
//		try {
//			isPalindrome(12322, 12322);
//			System.out.println(true);
//		} catch(Exception e) {
//			System.out.println(false);
//		}
		//System.out.println(palindromeWithoutExtraSpace(12321));
		System.out.println(palindromeWithoutExtraSpaceWithRecursion(12321, getDivisor(12321)));
	}

}
