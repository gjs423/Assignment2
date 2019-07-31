public class SparseMatrix {

	private int totalRow;
	private int totalCol;
	private MatrixRow firstRow;
	private MatrixColumn firstCol;
	
	public SparseMatrix(int row, int col) {
		
		totalRow = row;
		totalCol = col;
		firstRow = new MatrixRow(1);
		firstCol = new MatrixColumn(1);
		
		MatrixRow tempRow = firstRow;
		MatrixColumn tempCol = firstCol;
		for(int i = 2; i <= row; i++) {
			tempRow.setNextRow(new MatrixRow(i));
			tempRow = tempRow.getNextRow();
		}
		for(int i = 2; i <= col; i++) {
			tempCol.setNextColumn(new MatrixColumn(i));
			tempCol = tempCol.getNextColumn();
		}
		
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
		n.setCurrentRow(tempRow);
		insertNodeCol(n, col);
		
	}
	
	//used in insertNode to also insert into specific column
	private void insertNodeCol(ValueNode n, int col) {
		
		MatrixColumn tempCol = firstCol;
		for(int i = 1; i < col; i++) {
			tempCol = tempCol.getNextColumn();
		}
		n.setCurrentColumn(tempCol);
		tempCol.insertBackValueNode(n);
		
	}
	
	public void print() {
		
		MatrixRow tempRow = firstRow;
		for(int i = 1; i <= totalRow; i++) {
			ValueNode tempNode = tempRow.getHead();
			for(int j = 1; j < totalCol; j++) {
				if(tempNode.getCurrentColumn().getColNum() == j) {
					System.out.print(tempNode.getValue() + " ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			tempRow = tempRow.getNextRow();
		}
		
	}
	
	public void transpose() {
		
		MatrixColumn tempCol = firstCol;
		for(int i = 1; i <= totalCol; i++) {
			ValueNode tempNode = tempCol.getHead();
			for(int j = 1; j < totalRow; j++) {
				if(tempNode.getCurrentRow().getRowNum() == j) {
					System.out.print(tempNode.getValue() + " ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			tempCol = tempCol.getNextColumn();
		}
		
	}
	
}
