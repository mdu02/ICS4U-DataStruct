/**
 * Tester program for a custom LinkedList
 * @author ICS4U
 * @version Oct 2019
 */
class LinkedListTester {
    public static void main(String[] args){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        SinglyLinkedList<String> linkedList2 = new SinglyLinkedList<String>();
        
        linkedList.add("RHHS");
        linkedList.add("is");
        linkedList.add("the");
        linkedList.add("best");
        linkedList.add("school");
        //add calls to other methods to test them
        System.out.println(linkedList.size());
        System.out.println(linkedList.remove("best"));
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList2.size());
    }
}

