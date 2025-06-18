import java.util.Scanner;

// Matrix class definition
class Matrix {
    int[][] mat;
    int rows, cols;

    // Constructor to initialize matrix
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    // Method to input matrix elements
    public void inputMatrix(Scanner sc) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
}

// Thread to display the matrix
class DisplayMatrix extends Thread {
    Matrix matrix;

    public DisplayMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Thread to display the transpose of the matrix
class TransposeMatrix extends Thread {
    Matrix matrix;

    public TransposeMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < matrix.cols; i++) {
            for (int j = 0; j < matrix.rows; j++) {
                System.out.print(matrix.mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}

// Thread to display the maximum value in the matrix
class MaxValueMatrix extends Thread {
    Matrix matrix;

    public MaxValueMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        int max = matrix.mat[0][0];
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (matrix.mat[i][j] > max) {
                    max = matrix.mat[i][j];
                }
            }
        }
        System.out.println("Maximum value in the matrix: " + max);
    }
}

// Thread to display principal diagonal elements
class PrincipalDiagonal extends Thread {
    Matrix matrix;

    public PrincipalDiagonal(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        if (matrix.rows != matrix.cols) {
            System.out.println("Principal diagonal is not possible for non-square matrix.");
            return;
        }
        System.out.println("Principal Diagonal elements:");
        for (int i = 0; i < matrix.rows; i++) {
            System.out.print(matrix.mat[i][i] + " ");
        }
        System.out.println();
    }
}

// Thread to display non-diagonal elements
class NonDiagonalElements extends Thread {
    Matrix matrix;

    public NonDiagonalElements(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        System.out.println("Non-diagonal elements:");
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (i != j) {
                    System.out.print(matrix.mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.inputMatrix(sc);

        // Creating threads for different matrix operations
        DisplayMatrix t1 = new DisplayMatrix(matrix);
        TransposeMatrix t2 = new TransposeMatrix(matrix);
        MaxValueMatrix t3 = new MaxValueMatrix(matrix);
        PrincipalDiagonal t4 = new PrincipalDiagonal(matrix);
        NonDiagonalElements t5 = new NonDiagonalElements(matrix);

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        sc.close();
    }
}
