//Author: Huakai Zeng
//Date: 28th july 2019
//Description: ValueNode draft


public class ValueNode {


    //row number and col number
    private MatrixRow currentRow;
    private MatrixColumn currentColumn;

    //EACH ValueNode's contain a single value (element)
    private int value;


    // node of row
    private ValueNode nextValueNodeRow;

    //node of Column
    private ValueNode nextValueNodeColumn;


    private ValueNode head;

    private ValueNode next;


    //getNext
    public ValueNode getNext(){
        return next;

    }

    public void setNext(ValueNode next) {
        this.next = next;
    }

    //constructor for ValueNode

    public ValueNode(int val){
        this.value = val;



    }


    public void printValueNode() {

        ValueNode cur = head;




        while (cur != null) {

            System.out.printf("%d", cur.getValue());
            cur = cur.getNext();


        }

        System.out.println();


    }








    //set value for current row
    public void setCurrentRow(MatrixRow val){
        this.currentRow = val;

    }

    //set value for current column
    public void setCurrentColumn(MatrixColumn val){
        this.currentColumn = val;
    }


    //get value for current row
    public MatrixRow getCurrentRow(){
        return currentRow;
    }


    //get value for current column

    public MatrixColumn getCurrentColumn(){
        return currentColumn;
    }

    public void setValue(int val){
        this.value = val;

    }


    public int getValue() {
        return value;
    }

    public void setNextValueNodeRow(ValueNode nextValueNodeRow) {
        this.nextValueNodeRow = nextValueNodeRow;
    }


    public void setnextValueNodeColumn(ValueNode nextValueNodeColumn) {
        this.nextValueNodeColumn = nextValueNodeColumn;
    }


    public ValueNode getNextValueNodeRow() {
        return nextValueNodeRow;
    }


    public ValueNode getNextValueNodeColumn() {
        return nextValueNodeColumn;
    }
}
