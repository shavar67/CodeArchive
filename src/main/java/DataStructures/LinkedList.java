package DataStructures;

/*
   A link is an object
   each link has a reference to another link in the list
   the linkedlist has only a reference to the the last
   linked that was added.

   How is a new link added?
   New link is created
   its next is assigned the reference to the previous link created
   the linkedlist's first link is assigned a reference to the newest link added

   To remove a link
   The linkedlists firstlink is assigned the value of the current firstlink next.

   How do you cycle through all links?
   Start at the reference stored in firstlink for the linkedlist
   get the references stored in next for every link until it returns null

   How to find a link in the linkedlist
   Check the data for the firstlink reference stored in the linkedlist
   if you don't get a match continue searching every reference stored
   in the next until next returns null
 */
public class LinkedList {

    public Link firstLink;

    public LinkedList() {

        firstLink = null;
    }

    public boolean isEmpty() {

        return (firstLink == null);
    }

    public void insertFirstlink(String bookName, int millionSold) {
        Link newLink = new Link(bookName, millionSold);
        /*
           the first link field now have the address to the previous link
         */
        newLink.next = firstLink;
        firstLink = newLink;
    }


    public Link removeFirst() {
        Link linkReference = firstLink.next;
        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty linkedlist");
        }

        return linkReference;
    }

    public void display(){
        Link theLink = firstLink;
        while(theLink != null){
            theLink.display();
            System.out.println("Next link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;
        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty linkedlist");
        }
        return theLink;
    }

    public Link removeLink(String bookName){
        Link currentlink = firstLink;
        Link previousLink = firstLink;
        while(!currentlink.bookName.equals(bookName)){
            if(currentlink.next == null){
                return null;
            }else{
                previousLink = currentlink;
                currentlink = currentlink.next;

            }
        }
        if(currentlink == firstLink){
            firstLink = firstLink.next;
        }
        else{
            previousLink.next = currentlink.next;

        }
        return currentlink;
    }

}
