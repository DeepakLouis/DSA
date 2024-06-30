package recursion;

public class GenerateSubsets {

	public static void main(String[] args) {
		generateSubsets("abc", "", 0);
	}
	
	static void generateSubsets(String originalString, String subset, int pos) {
		
		if(pos == originalString.length()) {
			System.out.println(subset);
			return;
		}
		
		generateSubsets(originalString, subset, pos + 1);
		generateSubsets(originalString, subset + originalString.charAt(pos), pos + 1);
	}
}
