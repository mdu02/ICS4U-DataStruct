/**
 * Custom LinkedList implementation
 * @author ICS4U
 * @version Oct 2019
 */
class Stack<E extends Comparable<E>>{
    private Node<E> head;
    //Constructor
    public Stack(){
        this.head = null;
    }

    public void push(E item){
        Node<E> curr = this.head;
        this.head = new Node<E>(item, curr);
    }
    public E peek(){
        return this.head.getItem();
    }
    public E pop(){
        Node<E> curr = this.head;
        this.head = curr.getNext();
        return curr.getItem();
    }

    //------------------------------------------------------------------------------
    //Returns String representation of the list.
    @Override
    public String toString(){
        if (this.head == null){return "";}
        Node<E> currentNode = this.head;
        String s = currentNode.getItem().toString();
        while(currentNode.getNext()!=null){
            currentNode = currentNode.getNext();
            s = s +", "+ currentNode.getItem().toString();
        }
        return "["+ s +"]";
    }
    //------------------------------------------------------------------------------
//  inner class Node
//------------------------------------------------------------------------------
    private class Node<T>{
        private T item;
        private Node<T> next;

        //Node constructor
        public Node(T item, Node<T> next){
            this.item = item;
            this.next = next;
        }
        //getters and setters
        public Node<T> getNext(){
            return this.next;
        }
        public void setNext(Node<T> next){
            this.next = next;
        }
        public T getItem(){
            return this.item;
        }
        public void setItem(T item){
            this.item = item;
        }
    } //end of Node class
} //end of SinglyLinkedList class



