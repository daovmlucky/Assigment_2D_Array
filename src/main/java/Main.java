
import java.util.*;

public class Main {

	public static void printMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0; i < row;i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate2DArray rotate2dArray = new Rotate2DArray();
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
		System.out.println("Matrix before rotate");
		printMatrix(matrix);
		rotate2dArray.rotateMatrix(matrix);
		System.out.println("Matrix after rotate");
		printMatrix(matrix);
	}

}
