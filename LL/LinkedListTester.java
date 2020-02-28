/**
 * Tester program for a custom LinkedList
 * @author ICS4U
 * @version Oct 2019
 */
class LinkedListTester {
    public static void main(String[] args){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        SinglyLinkedList<String> ll2 = new SinglyLinkedList<String>();
        linkedList.add("RHHS");
        linkedList.add("is");
        linkedList.add("the");
        linkedList.add("best");
        linkedList.add("school");
        ll2.add("TEST");
        //add calls to other methods to test them
        linkedList.swap(1,3);
        linkedList.printLast(3);
        linkedList.join(ll2);
        System.out.println(linkedList);
    }
}

