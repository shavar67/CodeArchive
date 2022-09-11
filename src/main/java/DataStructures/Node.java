package DataStructures;

public class Node {

    int key;
    String name;
    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.name = name;
        this.key = key;

    }

    public String toString(){
        return name + " has a key of  " + key;
    }

}
