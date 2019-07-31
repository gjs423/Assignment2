


public class MatrixColumn {



    //head of this column, HEAD is the FIRST ValueNode

    private ValueNode head;

    // the next column of this column (think of this as the next row's number). this attributes will be utilized in sparsematrix
    private MatrixColumn nextColumn;



    //constructor
    public MatrixColumn(){

    }


    //this allows you to set the NEXT column of this
    public void setNextColumn(MatrixColumn nextColumn) {
        this.nextColumn = nextColumn;
    }

    //get the next column of THIS column
    public MatrixColumn getNextColumn(){
        return nextColumn;
    }






    //bool for isempty
    public boolean isEmpty(){
        if (head == null){
            return true;

        }else{
            return false;
        }
    }




    //insert a ValueNode at the back
    public void insertBackValueNode(int val){
        ValueNode node = new ValueNode(val);


        if (isEmpty()) {

            head = node;


        }else{
            ValueNode cur = head;

            while(cur.getNextValueNodeColumn() != null){
                cur = cur.getNextValueNodeColumn();



            }


            cur.setnextValueNodeColumn(node);
        }

    }




    //insert valueNode from the front

    public void insertFrontValueNode(int val){

        ValueNode node = new ValueNode(val);

        node.setnextValueNodeColumn(head);

        head = node;

    }

    //get a value stored at specifix position

    public int getElementColumn(int index){


        //cur = head
        ValueNode cur  = head;

        //test for out of bounds

        for(int i = 0; i < index; i++){
            if(cur == null){

                //throw new when you want to display error and print stuff
                throw new IndexOutOfBoundsException("the index you entered is out of bound");
            }
            //update cur to successor
            cur = cur.getNextValueNodeColumn();

        }
        return cur.getValue();
    }


    //print method to test

    public void print() {


        ValueNode cur = head;



        while (cur != null) {

            System.out.printf("%d", cur.getValue());
            cur = cur.getNextValueNodeColumn();


        }

        System.out.println();


    }

    //additional methods removeFront, removeBack



    //remove element from row from the front.

    public void removeFront(){
        ValueNode cur = head;

        if(cur == null){
            throw new IndexOutOfBoundsException("there is no element in this linkedList to be removed");
        }else{
            head = head.getNextValueNodeColumn();
        }

    }


    //remove element from the back
    public void removeBack(){


        ValueNode cur = head;


        if(head != null){


            if(head.getNextValueNodeColumn() == null ){

                head = null;



            }else{

                cur = head.getNextValueNodeColumn();

                while(cur.getNextValueNodeColumn().getNextValueNodeColumn() != null) {

                    cur = cur.getNextValueNodeColumn();
                }

                cur.setnextValueNodeColumn(null);
            }
        }else{


            throw new NullPointerException("The head is null");
        }
    }

}

