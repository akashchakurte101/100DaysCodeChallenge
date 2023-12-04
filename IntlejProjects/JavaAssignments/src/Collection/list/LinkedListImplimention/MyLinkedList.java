package Collection.list.LinkedListImplimention;

public class MyLinkedList {
    private  Node currentnode;

    public Node getCurrentnode() {
        return currentnode;
    }

    public void setCurrentnode(Node currentnode) {
        this.currentnode = currentnode;
    }



    public void addElement(String value){
      //  System.out.println(currentnode);
        if(currentnode==null){
            Node node=new Node();
            node.setValue(value);
           // System.out.println(node);
            currentnode=node;
        }
        else{
            Node lastNode=currentnode;
            lastNode.getNextNode();
            System.out.println(lastNode);
            Node newnode=new Node();
            newnode.setValue(value);
         //   System.out.println(newnode);
            lastNode.setNextNode(newnode);

        }


    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "currentnode=" + currentnode +
                '}';
    }
}
