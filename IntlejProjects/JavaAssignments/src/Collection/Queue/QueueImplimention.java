package Collection.Queue;

import java.util.Objects;

public class QueueImplimention {

    private String arr[];
    private int startOfQueue;
    private int endOfQueue;

    public QueueImplimention(int size)
    {
        arr=new String[size];
        startOfQueue=0;
        endOfQueue=0;
    }

    public void addElement(String element){
        arr[endOfQueue]=element;
        endOfQueue=endOfQueue+1;
        if(endOfQueue>=arr.length){
            endOfQueue=endOfQueue%arr.length;
        }
    }
    public void printQueue(){
        for(String str : arr){
            if (Objects.nonNull(str)) {
                System.out.print(str + "|");
            }
        }
        System.out.println("");
    }


}
