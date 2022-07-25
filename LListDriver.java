public class LListDriver {
    public static void main(String[] args) throws Exception 
        {
            /* Start with the empty list. */
            LList list = new LList();
     
            //
            // ******INSERTION******
            //
     
            // Insert the values
            list = LList.InsertNode(list, 1);
            list = LList.InsertNode(list, 2);
            list = LList.InsertNode(list, 3);
            list = LList.InsertNode(list, 4);
            list = LList.InsertNode(list, 5);
            list = LList.InsertNode(list, 6);
            list = LList.InsertNode(list, 7);
            list = LList.InsertNode(list, 8);
     
            // Print the LinkedList
            LList.printList(list);
     
            //
            // ******DELETION BY KEY******
            //
     
            // Delete node with value 1
            // In this case the key is ***at head***
            LList.deleteByKeyLList(list, 1);
     
            // Print the LinkedList
            LList.printList(list);
     
            // Delete node with value 4
            // In this case the key is present ***in the
            // middle***
            LList.deleteByKeyLList(list, 4);
     
            // Print the LinkedList
            LList.printList(list);
     
            // Delete node with value 10
            // In this case the key is ***not present***
            LList.deleteByKeyLList(list, 10);
     
            // Print the LinkedList
            LList.printList(list);
     
            //
            // ******DELETION AT POSITION******
            //
     
            // Delete node at position 0
            // In this case the key is ***at head***
            LList.deleteAtPosition(list, 0);
     
            // Print the LinkedList
            LList.printList(list);
     
            // Delete node at position 2
            // In this case the key is present ***in the
            // middle***
            LList.deleteAtPosition(list, 2);
     
            // Print the LinkedList
            LList.printList(list);
     
            // Delete node at position 10
            // In this case the key is ***not present***
            LList.deleteAtPosition(list, 10);
     
            // Print the LinkedList
            LList.printList(list);
        }
}
