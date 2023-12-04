package Collection.list.LinkedListImplimention;

public class Node {
    private String value;
    private Node NextNode;

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", NextNode=" + NextNode +
                '}';
    }

    public Node getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node nextNode) {
        NextNode = nextNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
