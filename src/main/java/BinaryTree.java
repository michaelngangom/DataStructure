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
//remove node - way too complex at the moment and not complete...will try a different approach
    public boolean remove(int key)
    {
        Node focusNode=root;
        Node parent=root;

        boolean isItLeftChild = true;

        while(focusNode.key !=key)
        {
            parent = focusNode;
            if(key < focusNode.key)
            {
                isItLeftChild= true;
                focusNode = focusNode.leftChild;
            }else {
                isItLeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null)
                return false;

        }
        if(focusNode.leftChild ==null && focusNode.rightChild==null)
        {
            if(focusNode==root){
                root = null;
            }else if(isItLeftChild){
                parent.leftChild=null;
            }else{
                parent.rightChild=null;
            }
        }
        else if(focusNode.rightChild==null)
        {
            if(focusNode==root)
            {
                root=focusNode.leftChild;
            }else if(isItLeftChild)
                parent.leftChild =focusNode.leftChild;
            else parent.rightChild=focusNode.leftChild;
        }
        else if(focusNode.leftChild==null)
        {
            if (focusNode==root)
                root=focusNode.rightChild;
        }
        return true;
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

    //pre order tree traversal
    public void preOrderTraversalRecursive(Node focusNode)
    {
        if(focusNode!=null)
        {
            System.out.println(focusNode);
            preOrderTraversalRecursive(focusNode.leftChild);

            preOrderTraversalRecursive(focusNode.rightChild);
        }

    }
//Post order traversal
    public void postOrderTraversalRecursive(Node focusNode)
    {
        if(focusNode!=null)
        {

            postOrderTraversalRecursive(focusNode.leftChild);

            postOrderTraversalRecursive(focusNode.rightChild);
            System.out.println(focusNode);
        }

    }

    public Node searchNode(int key)
    {
        Node focusNode=root;
        while(focusNode.key != key)
        {
            if(key<focusNode.key)
                focusNode = focusNode.leftChild;
            else {
                focusNode = focusNode.rightChild;
            }
            if(focusNode ==null)
            return null;
        }
return focusNode;
    }

    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.addNode(10,"Mike");
        tree.addNode(5,"Tom");
        tree.addNode(30,"Jack");

     //   tree.preOrderTraversalRecursive(tree.root);

     //   tree.postOrderTraversalRecursive(tree.root);


       // tree.preOrderTraversalRecursive(new Node(5,"Tom"));


        System.out.println( tree.searchNode(30));
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
        return name + " has a key " + key;
    }

        }