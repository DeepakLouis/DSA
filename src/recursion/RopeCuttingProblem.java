package recursion;

/**
 * https://www.geeksforgeeks.org/batch/dsa-4/track/DSASP-Recursion/video/MjMzMw%3D%3D
 */
public class RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int maxStep = ropeCutting(2, 2, 2, 9, 0);
		int maxStep = ropeCuttingWithoutPassingStep(12, 11, 9, 23);
		//int maxStep = ropeCuttingUsingAddition(2, 1, 5, 0, 5, 0);
		System.out.print(maxStep);

	}
	
	static int ropeCutting(int a, int b, int c, int total, int step) {
		if(total == 0) {
			return step;
		}
		
		if(total < 0) {
			return -1;
		}
		
		return Math.max(ropeCutting(a, b, c, total-c, step+1),
				Math.max(ropeCutting(a, b, c, total-a, step+1), ropeCutting(a, b, c, total-b, step+1)));
	}
	
	static int ropeCuttingWithoutPassingStep(int a, int b, int c, int total) {
		if(total == 0) {
			return 0;
		}
		
		if(total < 0) {
			return -1;
		}
		
		int maxVal = Math.max(ropeCuttingWithoutPassingStep(a, b, c, total - a), 
				Math.max(ropeCuttingWithoutPassingStep(a, b, c, total - b), ropeCuttingWithoutPassingStep(a, b, c, total - c)));
		
		if(maxVal == -1) {
			return -1;
		}
		
		return maxVal + 1;
	}
	
	static int ropeCuttingUsingAddition(int a, int b, int c, int total, int target, int step) {
		if(total == target) {
			return step;
		}
		
		if(total > target) {
			return -1;
		}
		
		int stepA = ropeCuttingUsingAddition(a, b, c, total + a, target, step+1);
		int stepB = ropeCuttingUsingAddition(a, b, c, total + b, target, step+1);
		int stepC = ropeCuttingUsingAddition(a, b, c, total + c, target, step+1);
		
		return Math.max(stepA, Math.max(stepB, stepC));
	}

}
