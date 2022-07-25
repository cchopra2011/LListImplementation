
public class LList{

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //*****************INSERTION************************** */
    
    /*Method to Insert New Node */

    public static LList InsertNode(LList list, int data){
        
        /*creata a new node with the given data */
        Node newNode = new Node(data);

        /*if in the begining List is Empty */
        if(list.head == null){
            list.head = newNode;
        }else{
            /*List contains the node and is not empty */
            Node temp = list.head;
            while(temp.next!=null){
                /*Iterate until we get temp.next!=null, so that after this we update new node into the next of temp */
                temp = temp.next;
            }
            temp.next = newNode;
        }

        return list;
    }

    // **************TRAVERSAL**************
 
    // Method to print the LinkedList.

    public static void printList(LList list){
        Node currNode = list.head;

        while(currNode!=null){
            /*print the currNode data */
            System.out.print(currNode.data+" -> ");

            /*point currNode to the nextNode */
            currNode = currNode.next;
        }
        System.out.print(" null ");
        System.out.println();
    }

    // **************DELETION BY KEY**************
 
    // Method to delete a node in the LinkedList by KEY

    public static LList deleteByKeyLList(LList lList, int key){

        Node currNode = lList.head;
        Node prev = null;

        /*Case 1 : searched key is found at the head of the Key  */

        if(currNode!=null && currNode.data==key){
            lList.head = currNode.next;
            return lList;
        }

        /*Case 2 : searched key is found except at the head of the Key  */

        /*iterate the curreNode until we get the currNode data equal to key */
        
        while(currNode!=null && currNode.data!=key){
            /*with this we will update the currNode and prevNode */
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode!=null){
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        
        }

        /*Case 3 : searched key is not found  */

        /*If the given key is not found , it should be null */
        if(currNode == null){
            System.out.println(key+"  not found ");
        }

        /*return the original list */
        return lList;
    }

    // **************DELETION AT A POSITION*************
 
    // Method to delete a node in the LinkedList by Position

    public static LList deleteAtPosition(LList list,int idx){

        /*Store the Node Head */
        Node currNode = list.head;
        Node prev=null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted
 
        if (idx == 0 && currNode != null) {
            list.head = currNode.next; // Changed head
 
            // Display the message
            System.out.println(
                idx + " position element deleted");
 
            // Return the updated List
            return list;
        }

        
        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;
 
        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {
 
            if (counter == idx) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;
 
                // Display the message
                System.out.println(
                    idx + " position element deleted");
                break;
            }
            else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(
                idx + " position element not found");
        }
 
        // return the List
        return list;
    }


}