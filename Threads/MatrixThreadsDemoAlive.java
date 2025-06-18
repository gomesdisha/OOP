import java.util.Scanner;

class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void fillMatrix(Scanner scanner) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getMaxValue() {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    public int[][] getTranspose() {
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public int[] getPrincipalDiagonal() {
        int[] diagonal = new int[Math.min(rows, cols)];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getNonDiagonalElements() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) count++;
            }
        }
        int[] nonDiagonal = new int[count];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) {
                    nonDiagonal[index++] = matrix[i][j];
                }
            }
        }
        return nonDiagonal;
    }
}

class MatrixDisplayThread extends Thread {
    private Matrix matrix;
    private String task;

    public MatrixDisplayThread(Matrix matrix, String task) {
        this.matrix = matrix;
        this.task = task;
    }

    @Override
    public void run() {
        switch (task) {
            case "display":
                displayMatrix();
                break;
            case "transpose":
                displayTranspose();
                break;
            case "max":
                displayMaxValue();
                break;
            case "diagonal":
                displayDiagonal();
                break;
            case "nonDiagonal":
                displayNonDiagonal();
                break;
        }
    }

    private void displayMatrix() {
        int[][] mat = matrix.getMatrix();
        System.out.println("Matrix:");
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    private void displayTranspose() {
        int[][] transpose = matrix.getTranspose();
        System.out.println("Transpose:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    private void displayMaxValue() {
        int max = matrix.getMaxValue();
        System.out.println("Maximum Value: " + max);
    }

    private void displayDiagonal() {
        int[] diagonal = matrix.getPrincipalDiagonal();
        System.out.print("Principal Diagonal: ");
        for (int val : diagonal) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    private void displayNonDiagonal() {
        int[] nonDiagonal = matrix.getNonDiagonalElements();
        System.out.print("Non-Diagonal Elements: ");
        for (int val : nonDiagonal) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class MatrixThreadsDemoAlive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.fillMatrix(scanner);

        MatrixDisplayThread t1 = new MatrixDisplayThread(matrix, "display");
        MatrixDisplayThread t2 = new MatrixDisplayThread(matrix, "transpose");
        MatrixDisplayThread t3 = new MatrixDisplayThread(matrix, "max");
        MatrixDisplayThread t4 = new MatrixDisplayThread(matrix, "diagonal");
        MatrixDisplayThread t5 = new MatrixDisplayThread(matrix, "nonDiagonal");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Check if threads are alive before joining
        System.out.println("Thread status before joining:");
        System.out.println("t1 is alive: " + t1.isAlive());
        System.out.println("t2 is alive: " + t2.isAlive());
        System.out.println("t3 is alive: " + t3.isAlive());
        System.out.println("t4 is alive: " + t4.isAlive());
        System.out.println("t5 is alive: " + t5.isAlive());

        try {
            // Join threads
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if threads are alive after joining
        System.out.println("Thread status after joining:");
        System.out.println("t1 is alive: " + t1.isAlive());
        System.out.println("t2 is alive: " + t2.isAlive());
        System.out.println("t3 is alive: " + t3.isAlive());
        System.out.println("t4 is alive: " + t4.isAlive());
        System.out.println("t5 is alive: " + t5.isAlive());

        scanner.close();
    }
}
