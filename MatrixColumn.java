public class MatrixColumn {

	private ValueNode firstNode;
	private MatrixColumn next;
	
	//constructor with no set values
	public void MatrixColumn() {
	}
	
	//constructor that sets the first value node
	public void MatrixColumn(ValueNode n) {
		
		firstNode = n;
		
	}
	
	//gets the first value node in the column
	public ValueNode getFirstValue() {
		
		return firstNode;
		
	}
	
	//sets first value node in the column
	public void setFirstValue(ValueNode n) {
		
		firstNode = n;
		
	}
	
	//gets next column
	public MatrixColumn getNext() {
		
		return next;
		
	}
	
	//sets next column
	public void setNext(MatrixColumn c) {
		
		this.next = c;
		
	}
	
	//inserts value node at the bottom of the column
	public void insertValue(ValueNode val) {
		
		ValueNode temp = firstNode;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(val);
		
	}
	
	//returns node at specified index starting at 0
	public ValueNode getNode(int index) {
		
		ValueNode temp = firstNode;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
		
	}
	
}
