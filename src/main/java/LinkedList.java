
class Node {
    Object obj;
    Node next;

    public Node() {
        obj = null;
    }

    public Node(Object obj) {
        this.obj = obj;
    }

    public String toString() {
        return obj.toString();
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = tail = null;
    }

    /**
     * This method returns the print representation of the list.
     * 
     * @return the print representation of the list.
     */
    public String toString() {
        String out = "";
        for (Node n = head; n != null; n = n.next)
            out += n.obj + " ";

        return out;
    }

    /**
     * This method returns the number of elements in this list.
     * 
     * @return the number of elements in this list.
     */
    public int size() {
        return size;
    }

    /**
     * This method adds an Object to the end of the LinkedList.
     * 
     * @param obj it can be of any type - super cool stuff.
     */
    public void add(Object obj) {
        Node node = new Node(obj);
        
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    /**
     * The method returns the found object based on the passed index.
     * It throws an Exception saying that you messed up, and you gotta fix it.
     * Starts at 0 but supports negatives and wraps the index around within
     * the limits of the list.
     * 
     * @param index the index of the object to be returned.
     * @return the object at the index.
     */
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.obj;
    }

    /** 
    * Removes the first matched object and
    * returns the position of the removed object
    * from the LinkedList.
    * 
    * @param   obj  represents the object the user wants to remove
    * @return       position of the removed object
    */
    public int remove(Object obj) {
        Node curr = head;
        Node prev = curr;

        int pos = 0;

        for (; curr != null && !curr.obj.equals(obj); prev = curr, curr = curr.next, pos++) //loops through linked list to find pos/node
        {
            
        }

        if (curr == head) //head if statement
        {
            head = curr.next; //sets head it equal to the next node removing the previous
            size--;
            return pos; //returns int
        }
        else if (curr == tail) //tail statement
        { 
            tail = prev; //sets tail to previous node, removing the current
            tail.next = null;
            size--;
            return pos;
        }
        else if (curr == null) 
        {
            return -1; //not possible
        }
        else //normal statement
        {
            prev.next = curr.next; //sets previous.next to be set to after current
            size--;
            return pos;
        }

       
    }

    /**
    * Removes the object given its position and
    * returns the removed object (not Node) from the LinkedList.
    * 
    * @param   position  represents the position of the object
    *                    to be removed
    * @return            the item that was removed
    */
    public Object remove(int position) {
        Node curr = head;
        Node prev = curr;

        int pos = 0;

        for (; curr != null && pos != position; prev = curr, curr = curr.next, pos++) //loops through linked list to find pos/node
        {
                
        }

        if (curr == head) //head if statement
        {
            head = curr.next; //sets head it equal to the next node removing the previous
            size--;
            return curr.obj; 
        }
        else if (curr == tail) //tail statement
        {
            tail = prev; //sets tail to previous node, removing the current
            tail.next = null;
            size--;
            return curr.obj;
        }
        else if (curr == null)
        {
            return null; //if pos == null
        }
        else //normal statement
        {
            prev.next = curr.next; //sets previous.next to be set to after current
            size--;
            return curr.obj;
        }

        
    }

    /**
    * Adds the object given its position in the LinkedList.
    * 
    * @param   obj       represents the object to be added
    * @param   position  represents the position of the object
    *                    to be added in the LinkedList
    */
    public void add(Object obj, int position) {
        Node curr = head;
        Node prev = curr;

        
        Node node = new Node(obj);
        
        int pos = 0; //tracks obj pos

        for (; curr != null && pos != position; prev = curr, curr = curr.next, pos++) //loops through linked list to get pos/node
        {
                
        }

        if (curr == head) 
        {
            node.next = curr; //sets next node to curr
            head = node; //sets head to added node
        }
        else if (curr == tail) {
            add(obj); //calls previous method cause it always adds to end
            
        }
        else if (curr == null) {
            System.out.println("Index out of bounds"); //dont think this method actually does anything
        }
        else {
            prev.next = node; //sets current node the one wanting to be added
            node.next = curr; //points next node to previous current node
        }
        
        size++;

    }
    
    public static void main(String[] args) {
        LinkedList vitaly = new LinkedList();
        vitaly.add("13");
        vitaly.add("73");
        vitaly.add("95");
        vitaly.add("2");
    
        //this is just me testing methods
        vitaly.add("20",1);
        System.out.println(vitaly.get(4));

     }
}
