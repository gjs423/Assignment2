public class SparseMatrix {

	private int totalRow;
	private int totalCol;
	private MatrixRow firstRow;
	private MatrixColumn firstCol;
	
	public SparseMatrix(int row, int col) {
		
		totalRow = row;
		totalCol = col;
		firstRow = new MatrixRow();
		firstCol = new MatrixColumn();
		
		MatrixRow tempRow = firstRow;
		MatrixColumn tempCol = firstCol;
		for(int i = 0; i < row; i++) {
			tempRow.setNextRow(new MatrixRow());
			tempRow = tempRow.getNextRow();
		}
		for(int i = 0; i < col; i++) {
			tempCol.setNextColumn(new MatrixColumn());
			tempCol = tempCol.getNextColumn();
n		}
		
	}
	
	public int getTotalRow() {
		return totalRow;
	}
	public int getTotalCol() {
		return totalCol;
	}
	public MatrixRow getFirstRow() {
		return firstRow;
	}
	public MatrixColumn getFirstCol() {
		return firstCol;
	}
	
	//given the row, column, and a value node, inserts the node into that location
	public void insertNode(int row, int col, ValueNode n) {
		
		MatrixRow tempRow = firstRow;
		for(int i = 0; i < row; i++) {
			tempRow = tempRow.getNextRow();
		}
		tempRow.insertBackValueNode(n);
		insertNodeCol(n, col);
		
	}
	
	//used in insertNode to also insert into specific column
	private void insertNodeCol(ValueNode n, int col) {
		
		MatrixColumn tempCol = firstCol;
		for(int i = 1; i < col; i++) {
			tempCol = tempCol.getNextColumn();
		}
		tempCol.insertBackValueNode(n);
		
	}
	
	public void print() {
		
		
		
	}
	
}
