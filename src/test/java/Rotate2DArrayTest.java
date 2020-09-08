
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
public class Rotate2DArrayTest {
	private Rotate2DArray rotate2dArray;
	
	@Before
	public void setup() {
		rotate2dArray = new Rotate2DArray();
	}
	
	@Test
	public void testInvalidMatrix() {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		assertThat(rotate2dArray.rotateMatrix(matrix)).isNull();
	}
	
	@Test
	public void testOddNumberRowMatrix() {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int size = matrix.length;
		boolean flag = false;
		int[][] copy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
		for(int count = 0 ;count < 4; ++count) {
			rotate2dArray.rotateMatrix(matrix);
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(matrix[i][j] == copy[i][j]) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		assertThat(flag).isTrue();
	}
	
	@Test
	public void testEvenNumberRowMatrix() {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
		int size = matrix.length;
		boolean flag = false;
		int[][] copy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
		for(int count = 0 ;count < 4; ++count) {
			rotate2dArray.rotateMatrix(matrix);
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(matrix[i][j] == copy[i][j]) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		assertThat(flag).isTrue();
	}
}
