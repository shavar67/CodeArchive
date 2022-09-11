package DataStructures;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList theLinkedList  = new LinkedList();
        theLinkedList.insertFirstlink("Don Quixote",500);
        theLinkedList.insertFirstlink("A Tale of Two Cities",200);
        theLinkedList.insertFirstlink("The Lord Of The Rings",150);
        theLinkedList.insertFirstlink("Harry Potter and the Sorcerer",500);

        theLinkedList.removeFirst();
        System.out.println(theLinkedList.find("The Lord Of The Rings").bookName + " was Found");
        theLinkedList.removeLink("The Lord Of The Rings");
        theLinkedList.display();




    }
}
