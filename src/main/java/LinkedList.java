/**
 * Created by michaelngangom on 12/2/16.
 */
public class LinkedList {

public static LinkedListImplementation list;


    public static void main(String[] args)
    {
    list = new LinkedListImplementation();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    System.out.println(list);
    }


}

class LinkedListImplementation{


    private static int counter;
    private Node head;

    public LinkedListImplementation() {
    }

    public void add(Object data)
    {
        if(head ==null)
        {
            head = new Node(data);
        }
        Node tempNode = new Node(data);
        Node currentNode = tempNode;

        if(currentNode !=null){
            while (currentNode.getNext() !=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(tempNode);
        }
        incrementCounter();


    }
    private static int getCounter(){
        return counter;
    }
    private static void incrementCounter()
    {
        counter++;
    }
    private static void decrementCounter()
    {
        counter--;
    }
    //to add in a specific place
    public void add(Object data, int index){
        Node tempNode = new Node(data);
        Node currentNode = head;

        //check if the linkedList actually exist by checking if the head is empty which
        //is assigned to currentNode
        if (currentNode !=null)
        {//iterate to the searched position
            for(int i=0;i<index && currentNode.getNext() !=null;i++)
            {
                currentNode =currentNode.getNext();
            }
        }//get the next value of the search index
        tempNode.setNext(currentNode.getNext());
        //and make the current node to next
        currentNode.setNext(tempNode);

        incrementCounter();




    }
    private class Node{
        Node next;
        Object data;
        public Node(Object dataValue){
            next=null;
            data=dataValue;
        }
        public Node(Object dataValue, Node nextValue)
        {
            next= nextValue;
            data=dataValue;
        }
        public Object getData()
        {return data;
        }
        public void setData(Object dataValue){
            data=dataValue;
        }
        public Node getNext()
        {
            return next;
        }
        public void setNext(Node nextValue)
        {
            next=nextValue;
        }

    }

}

