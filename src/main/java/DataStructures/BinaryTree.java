package DataStructures;

/*
             (A) <-- root
 Path ->  /       \
       (B)        (C) <------ A AND B ARE NODES; B IS THE PARENT OF D & E and C IS THE PARENT OF F & G
      /  \        /  \
   (D)   (E)   (F)    (G)   <---- D,E,F ,G ARE CHILDREN NODES
               / \         <----- ALSO D ,E AND G ARE CONSIDERED LEAFS BECAUSE THEY DONT HAVE ANY CHILDREN
           (H)    (I)      F, H & I IS A SUBTREE ANYTHING


   A BINARY TREE WILL ONLY HAVE 2 CHILDREN
   DOESNT NEED BOTH CHILDREN
   THE PARENT IS THE MIDDLE VALUE KNOW AS A KEY
   THE VALUES TO THE LEFT OF THE PARENT IS THE LEFT CHILD
   AND THE VALUES GREATER THAN THE PARENT ARE THE RIGHT CHILD


   WHAT IS AN UNBALANCED TREE?
   RANDOM DATA NORMALLY ISNT UNBALANCED
   ORDERED DATA TENDS TO CREATE UNBALANCED TREES
   UNBALANCED TREES ARE SLOW

   PROS:
   YOU CAN SEARCH AND INSERT / DELETE ITEMS QUICKLY
   BIG O = > 0(LOG N)

 */
public class BinaryTree {


    Node root;

    /**
     * @param key
     * @param name
     * When adding a new node to the tree if there isnt a root
     *   parent node, we make the newNode the root node.
     */
    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;

                    }
                }
            }

        }
    }

    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(50,"Root Node");
        binaryTree.addNode(25,"Vice Pres");
        binaryTree.addNode(15,"Secretary");
        binaryTree.addNode(30,"Sales Manager");
        binaryTree.addNode(75,"Salesman");
        binaryTree.addNode(104,"District Manager");
        binaryTree.inOrderTraverseTree(binaryTree.root);



    }
}
