package recursion;

import java.util.Scanner;

/*
 * Date - 07:01:2024
 */
public class PalindroneForStrings {
	
	static boolean isPalindrome(String s, int start, int end) {
		
		if(start >= end) {
			return true;
		}
		
//		if(s.charAt(start) != s.charAt(end)) {
//			return false;
//		}
		
		return (s.charAt(start) == s.charAt(end) && isPalindrome(s, start+1, end-1));
	}
 
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String s = "aabbaa";
		System.out.println(isPalindrome(s, 0, s.length() - 1));
	}
}
