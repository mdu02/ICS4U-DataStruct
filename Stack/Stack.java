/**
 * Custom Stack implementation
 * @author Michael
 * @version Feb 2020
 */
class Stack<E extends Comparable<E>>{
    private Node<E> head;
    private int size;
    //Constructor
    public Stack(){
        this.head = null;
    }

    public void push(E item){
        size++;
        Node<E> curr = this.head;
        this.head = new Node<E>(item, curr);
    }
    public E peek(){
        return this.head.getItem();
    }
    public E pop(){
        size--;
        Node<E> curr = this.head;
        this.head = curr.getNext();
        return curr.getItem();
    }
    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public E get(int index){
        Node<E> curr = head;
        for (int i = 0; i<(size-index-1); i++){
            curr = curr.getNext();
        }
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



