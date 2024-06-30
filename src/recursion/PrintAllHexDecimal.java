package recursion;

public class PrintAllHexDecimal {
	
	public static void main(String[] args) {
		printOctal(0, 0, 0);
	}
	
	static void printOctal(int a, int b, int c) {
		if(a > 1 || b > 1 || c > 1) {
			return;
		}
		
		System.out.println(a + "" + b + "" + c);
		printOctal(a+1, b, c);
		printOctal(a, b+1, c);
		printOctal(a, b, c+1);
	}
}


