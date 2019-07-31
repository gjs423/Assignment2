public class SparseMatrix {
    private int totalRows;
    private int totalColumns;
    private MatrixRow firstRow;
    private MatrixColumn firstColumn;
    private int row;
    private int column;
    private int value;

    //Creating sparseMatrix With rows and columns
    public SparseMatrix(int totalRows, int totalColumns) {
        MatrixRow curRow = firstRow;
        MatrixColumn curColumn = firstColumn;

        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalColumns; j++) {
                curColumn = curColumn.getNextColumn();
            }
            curRow = curRow.getNextRow();
        }
    }

    //Inserting Values in the sparseMatrix
    public void insertValue(int curRow, int curColumn, int val){
    }

    //Printing the SparseMatrix
    public void printSparseMatrix() {
        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalColumns; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Transpose


    //Getters for row, column, value
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }
}//end of class SparseMatrix
