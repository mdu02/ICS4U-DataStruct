/**
 * Custom Queue implementation
 * @author Michael Du
 * @version March 2020
 */
class SimpleQueue<E extends Comparable<E>>{
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    //Constructor
    public SimpleQueue(){
        this.head = null;
        this.tail = null;
    }

    //Appends the specified element to the end of this list.
    public void enqueue(E item){
        size++;
        if (head == null){
            head = new Node<E>(item,null);
            tail = head;
        } else {
            Node<E> newNode = new Node<E>(item, null);
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    
    //Returns the element at the specified position in this list.
    public E dequeue(){
        size--;
        Node<E> ret = head;
        head = ret.getNext();
        return ret.getItem();
    }

    //Returns the number of elements in this list.
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (this.head==null);
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
} //end of SimpleQueue class



