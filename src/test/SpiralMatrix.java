package test;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{1},
				{5},
				{9},
				{13}
				};
		
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int columnStart = 0;
		int columnEnd = matrix[0].length - 1;
		
		while(rowStart <= rowEnd || columnStart <= columnEnd) {
			PrintMatrixRowColumn printMatrix = new PrintMatrixRowColumn(matrix,
					rowStart, rowEnd, columnStart, columnEnd);
			printMatrix.print();
			++rowStart;
			--rowEnd;
			++columnStart;
			--columnEnd;
		}
				
	}
}

class PrintMatrixRowColumn {
	
	private int[][] matrix;
	private int rowStart;
	private int rowEnd;
	private int columnStart;
	private int columnEnd;
	
	public PrintMatrixRowColumn(int[][] matrix, int rowStart, int rowEnd, int columnStart, int columnEnd) {
		this.matrix = matrix;
		this.rowStart = rowStart;
		this.rowEnd = rowEnd;
		this.columnStart = columnStart;
		this.columnEnd = columnEnd;
	}
	
	private boolean isVisited(int row, int column) {
		return matrix[row][column] == -1;
	}
	
	private void markVisited(int row, int column) {
		matrix[row][column] = -1;
	}
	
	public void printTopRow() {
		for(int i=columnStart; i<columnEnd; i++) {
			if(isVisited(rowStart, i)) {
				break;
			}
			
			System.out.println(matrix[rowStart][i]);
			markVisited(rowStart, i);
		}
	}
	
	public void printRightColumn() {
		for(int i=rowStart; i<rowEnd; i++) {
			if(isVisited(i, columnEnd)) {
				break;
			}
			System.out.println(matrix[i][columnEnd]);
			markVisited(i, columnEnd);
		}
	}
	
	public void printBottomRow() {
		for(int i=columnEnd; i>columnStart; i--) {
			if(isVisited(rowEnd, i)) {
				break;
			}
			System.out.println(matrix[rowEnd][i]);
			markVisited(rowEnd, i);
		}
	}
	
	public void printLeftColumn() {
		for(int i=rowEnd; i>rowStart; i--) {
			if(isVisited(i, columnStart)) {
				break;
			}
			System.out.println(matrix[i][columnStart]);
			markVisited(i, columnStart);
		}
	}
	
	public void print() {
		printTopRow();
		printRightColumn();
		printBottomRow();
		printLeftColumn();
	}
	
}
