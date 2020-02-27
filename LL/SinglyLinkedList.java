/**
 * Custom LinkedList implementation
 * @author ICS4U
 * @version Oct 2019
 */
class SinglyLinkedList<E extends Comparable<E>>{ 
    private Node<E> head;
    
    //Constructor
    public SinglyLinkedList(){
        this.head = null;
    }

    //Appends the specified element to the end of this list.
    public boolean add(E item){ 
        if (head == null){
            head = new Node<E>(item,null);
            return true;
        }
        Node<E> currentNode = head;
        while(currentNode.getNext()!=null){ 
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node<E>(item,null));
        return true;
    }
    
    //Returns the element at the specified position in this list.
    public E get(int index){
        Node<E> curr = head;
        for (int i = 0; i<index; i++){
            curr = curr.getNext();
        }
        return curr.getItem();
    }

    //Returns the index of the first occurrence of the specified element in this list,
    //or -1 if this list does not contain the element.    
    public int indexOf(E item){
        Node<E> curr = head;
        int index = 0;
        while (curr != null){
            if (curr.getItem().equals(item)){
                return index;
            }
            curr = curr.getNext();
            index++;
        }
        return -1;
    }
    
    //Removes the element at the specified position in this list.
    public E remove(int index){
        Node<E> curr = head;
        if (index == 0){
            head = curr.getNext();
            return curr.getItem();
        } else {
            for (int i = 0; i<index-1; i++){
                curr = curr.getNext();
            }
            Node<E> next;
            next = curr.getNext();
            curr.setNext(next.getNext());
            return next.getItem();
        }
    }

    //Removes the first occurrence of the specified element from this list, if it is present.    
    public boolean remove(E item){
        int ind = indexOf(item);
        if (ind == -1){
            return false;
        }
        remove(ind);
        return true;
    }

    //Removes all of the elements from this list.
    public void clear(){
        head = null;
    }

    //Returns the number of elements in this list.
    public int size(){
        Node<E> curr = head;
        int index = 0;
        while (curr != null){
            curr = curr.getNext();
            index++;
        }
        return index;
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



