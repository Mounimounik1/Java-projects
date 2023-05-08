package JavaPackage;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] matrixA = { {1,2,3}, {4,5,6} };
		int[][] matrixB = { {7,8}, {9,10}, {11,12} };
		
		int[][] result = new int[matrixA.length][matrixB[0].length];
		
		
		for (int i = 0; i < matrixA.length; i++) {
			
			for (int j = 0; j < matrixB.length; j++) {
				
				int dotProduct = 0;
				for (int k = 0; k < matrixA[0].length; k++) {
				 Object dotProduct1 = matrixA[i][j][k] * matrixB[k][j];
				}
				
				result[i][j] = dotProduct;
			}
		}
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; i < result[0].length; j++) {
					System.out.println(result[i][j] + " ");
				}
	            System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
