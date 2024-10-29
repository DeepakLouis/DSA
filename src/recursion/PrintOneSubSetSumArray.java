package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintOneSubSetSumArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		printOneList(0, 8, new ArrayList<>(), arr);
	}

	static boolean printOneList(int index, int sum, List<Integer> list, int[] arr) {
		
		if(sum == 0) {
			list.forEach(num -> System.out.println(num));
			return true;
		}
		
		if(index == arr.length) {
			return false;
		}
		
		
		list.add(arr[index]);
		sum -= arr[index];
		boolean result = printOneList(index + 1, sum, list, arr);
		
		list.remove(list.size() - 1);
		sum += arr[index];
		return result || printOneList(index + 1, sum, list, arr);
	}
}
