//=========================PROBLEMS 2 AND 3 HAVE BEEN SOLVED TOGETHER===========================\\



package lab6p2;

class Matrix {
    private int m_rows;
    private int m_columns;
    private int[][] m_mat;

    Matrix(int[][] t_mat) {
        this.m_mat = t_mat;
        this.m_rows = t_mat.length;
        this.m_columns = t_mat[0].length;
    }

    //getters
    int getRows() { return this.m_rows; }
    int getColumns() { return this.m_columns; }
    int[][] getMatrix() { return this.m_mat; }
    int getElement(int i, int j) {
        try {
            return this.m_mat[i][j];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    //setter
    void setMatrix(int[][] t_mat) {
        this.m_mat = t_mat;
    }
    int setElement(int i, int j, int t_element) {
        try {
            this.m_mat[i][j] = t_element;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return -1; //-1 implies an error as occurred
        }
        return 1; //1 implies success
    }

    //methods

    static Matrix add(Matrix a, Matrix b) {
        int[][] result = new int[a.getRows()][a.getColumns()];
        Matrix resultMat = new Matrix(result);

        if(a.getRows() != b.getRows() || b.getColumns() != b.getColumns()) {
            System.out.println("The matrices cannot be added!");
        }
        else {
            for(int i = 0; i < a.getRows(); ++i) {
                for(int j = 0; j < a.getColumns(); ++j) {
                    resultMat.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
                }
            }
        }
        return resultMat;
    }

    static Matrix multiply(Matrix a, Matrix b) {
        int[][] result = new int[a.getRows()][b.getColumns()];
        Matrix resultMat = new Matrix(result);

        if(b.getRows() != a.getColumns()) {
            System.out.println("The matrices cannot be multiplied!");
        }
        else {
            for (int i = 0; i < a.getRows(); i++) {
                for (int j = 0; j < b.getColumns(); j++) {
                    for (int k = 0; k < b.getRows(); k++)
                        resultMat.setElement(i, j, resultMat.getElement(i, j) + a.getElement(i, k) + b.getElement(k, j));
                }
            }
        }
        return resultMat;
    }

}



public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[2][6];
        arr[0][0] = 1;
        Matrix first = new Matrix(arr);
        System.out.println(first.getRows());
        System.out.println(first.getColumns());
        int[][] copyMat = first.getMatrix();
        copyMat[0][5] = 3;
        System.out.println(first.getElement(30, 40)); //should trigger array out of bounds
        Matrix second = new Matrix(copyMat);

        Matrix newMat = Matrix.add(first, second);
        System.out.println(newMat.getElement(0, 0)); //should return 2

        Matrix anotherMat = Matrix.multiply(first, second);


    }
}
