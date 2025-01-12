package ArrayList;

public class SimpleTranspose {

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = { {1, 2}, {3, 4}, {5, 6} }; 
        int rows = matrix.length; 
        int cols = matrix[0].length; 

        // Initialize the transposed matrix with flipped dimensions
        int[][] transposedMatrix = new int[cols][rows]; 

        // Perform the transpose operation
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                transposedMatrix[j][i] = matrix[i][j]; 
            } 
        } 

        // Print original matrix
        System.out.println("Original Matrix:"); 
        printMatrix(matrix); 

        // Print transposed matrix
        System.out.println("\nTransposed Matrix:"); 
        printMatrix(transposedMatrix);
    } 
	 
    public static void printMatrix(int[][] matrix) { 
        for (int[] row : matrix) { 
            for (int value : row) { 
                System.out.print(value + " "); 
            } 
            System.out.println();
        } 
    }
}
