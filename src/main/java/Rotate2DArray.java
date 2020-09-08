

public class Rotate2DArray {
	public int[][] rotateMatrix(int[][] matrix) {
		//check size of col and row
		int row = matrix.length;
		int col = matrix[0].length;
		if(row != col) {
			return null;
		}
		int size = matrix.length - 1;
		for(int i = 0; i < (matrix.length / 2); ++i) {
			for(int j = i; j < size - i; ++j) {
				// 4 ways swap
				int position1 = matrix[size - j][i];
				int position2 = matrix[size - i][size - j];
				int position3 = matrix[j][size - i];
				int position4 = matrix[i][j];
				
				matrix[i][j] = position1;
				matrix[size - j][i] = position2;
				matrix[size - i][size - j] = position3;
				matrix[j][size -i] = position4;
			}
		}
		return matrix;
	}
	
}
