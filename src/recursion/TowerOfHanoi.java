package recursion;

/*
 * https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
 * */
public class TowerOfHanoi {
	
	private static long count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count = toh(3, 1, 3, 2);
		System.out.println(count);

	}
	
	private static long toh(int N, int from, int to, int aux) {
		
		if(N == 0) {
			return count;
		}
		
		toh(N-1, from, aux, to);
		System.out.printf("move disk %d from rod %d to rod %d", N, from, to);
		System.out.println();
		++count;
		toh(N-1, aux, to, from);
		return count;
	}

}
