/**
 * Created by michaelngangom on 11/30/16.
 */
public class BinaryTree {

    Node root;

    public void addNode(int key, String name)
    {
        Node newNode = new Node(key,name);
        if(root == null)
        {
            root=newNode;
        }
        else{
            Node focusNode =root;
            Node parent;

            while (true){
                parent=focusNode;
                if(key<focusNode.key){
                    focusNode=focusNode.leftChild;
                    if(focusNode==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }else{
                    focusNode=focusNode.rightChild;
                    if(focusNode==null)
                    {
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }



    }
    //In order traversal - aim for simplest value first => null move up

    public void inOrderTraversalRecursive(Node focusNode)
    {
        if(focusNode!=null)
        {
            inOrderTraversalRecursive(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraversalRecursive(focusNode.rightChild);
        }

    }

    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.addNode(10,"Mike");
        tree.addNode(20,"Tom");
        tree.addNode(30,"Jack");

        tree.inOrderTraversalRecursive(tree.root);
    }
}

class Node
{
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name)
    {this.key=key;
    this.name=name;}

    public String toString()
    {
        return name + "has a key" + key;
    }

        }