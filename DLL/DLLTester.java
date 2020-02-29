/**
 * Tester program for a custom Doubly Linked List
 * @author ICS4UE
 * @version Feb 2020
 */
class DLLTester {
    public static void main(String[] args){
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<String>();
        
        System.out.println("\ninserting item at the front:"); 
        linkedList.addFirst("school");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addFirst("best");
        System.out.println(linkedList +", list size = "+ linkedList.size());        
        linkedList.addFirst("the");
        System.out.println(linkedList +", list size = "+ linkedList.size());  
        linkedList.addFirst("is");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addFirst("RHHS");
        System.out.println(linkedList +", list size = "+ linkedList.size());

        linkedList.clear();
        System.out.println("\nempty list: "+ linkedList +", list size = "+ linkedList.size());
        
        System.out.println("\nappending item at the back:");
        linkedList.addLast("RHHS");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addLast("is");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addLast("the");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addLast("best");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        linkedList.addLast("school");
        System.out.println(linkedList +", list size = "+ linkedList.size());
        
        System.out.println("\ninserting item at specific index:");       
        for (int i=linkedList.size(); i>=0; i--){
            linkedList.add(i,"_");
            System.out.println(linkedList +", list size = "+ linkedList.size());              
        }
        //add calls to other methods to test them
    }
}

