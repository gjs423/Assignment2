//Author: Huakai Zeng
//Date: 28th july 2019
//Description: ValueNode draft


public class ValueNode {


    //row number and col number
    private int currentRow;
    private int currentColumn;

    //EACH ValueNode's contain a single value (element)
    private int value;


    // node of row
    private ValueNode nextValueNodeRow;

    //node of Column
    private ValueNode nextValueNodeColumn;






    //constructor for ValueNode

    public ValueNode(int val){
        this.value = val;



    }








    //set value for current row
    public void setCurrentRow(int val){
        this.currentRow = val;

    }

    //set value for current column
    public void setCurrentColumn(int val){
        this.currentColumn = val;
    }


    //get value for current row
    public int getCurrentRow(){
        return currentRow;
    }


    //get value for current column

    public int getCurrentColumn(){
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
