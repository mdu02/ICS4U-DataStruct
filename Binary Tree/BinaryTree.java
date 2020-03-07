/**
 * Custom Binary Search Tree implementation
 * @author ICS4UE
 * @version Feb 2020
 */
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class BinaryTree<E extends Comparable<E>>{
    Node<E> root;
    
    //Constructor
    public BinaryTree(){
        this.root = null;
    }
//------------------------------------------------------------------------------  
    //Adds the specified element to this tree if it is not already present.
    public boolean add(E item){
        if (this.root == null){root = new Node<E>(item);}
        else {
            Node<E> currentNode = this.root;
            int comp = item.compareTo(currentNode.getItem());        
            while (comp < 0 && currentNode.getLeft() != null || //while the item is smaller and left child is not empty
                   comp > 0 && currentNode.getRight() != null){ //or the item is greater and right child is not empty
                //move one level down to left or to right
                if (comp < 0){currentNode = currentNode.getLeft();}
                else {currentNode = currentNode.getRight();}
                //compare the item with the current node
                comp = item.compareTo(currentNode.getItem());             
            }
            //insert the item to left or to right
            if (comp < 0){currentNode.setLeft(item);}
            else if (comp > 0){currentNode.setRight(item);}
            else {return false;} //the item is present and cannot be inserted
        }
        return true;
    }
//------------------------------------------------------------------------------  
    //Removes the specified element from this tree if it is present.
    public boolean remove(E item){
        return false;
    }    
    //Returns true if this tree contains the specified element.
    public boolean contains(E item){
        return false;
    }
    //Returns true if this tree contains no elements.
    public boolean isEmpty(){
        return (this.root == null);
    }
    //Removes all of the elements from this tree.
    public void clear(){
        this.root = null;
    }
    //Returns the number of elements in this tree.
    public int size(){
        return 0;
    }
//------------------------------------------------------------------------------    
    //Returns String representation of the tree. Elements are in natural order.
    @Override
    public String toString(){
        if (this.root == null){return "[]";}
        Stack<Node<E>> stack = new Stack<Node<E>>();
        Node<E> currentNode = this.root;
        String s = "";
        while (!stack.empty() || currentNode != null){
            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }else {
                currentNode = stack.pop();
                s = s + currentNode.getItem().toString() +", ";
                currentNode = currentNode.getRight();
            }
        }
        return "["+ s.substring(0,s.length()-2) +"]";
    }
//------------------------------------------------------------------------------    
    //Returns String representation of the tree. Elements are in order by level.
//    @Override
//    public String toString(){
//        if (this.root == null){return "[]";}
//        Queue<Node<E>> q = new LinkedList<Node<E>>(); //LinkedList class implements Queue interface
//        q.add(this.root);
//        String s = "";
//        while (!q.isEmpty()){
//            Node<E> currentNode = q.remove();
//            s = s + currentNode.getItem().toString() +", ";
//            if (currentNode != null){
//                Node<E> leftChild = currentNode.getLeft();
//                if (leftChild != null){q.add(leftChild);}
//                Node<E> rightChild = currentNode.getRight();
//                if (rightChild != null){q.add(rightChild);}
//            }
//        }
//        return "["+ s.substring(0,s.length()-2) +"]";
//    }   
//------------------------------------------------------------------------------     
//  inner class Node  
//------------------------------------------------------------------------------  
    private class Node<T>{
        private T item;
        private Node<T> left;
        private Node<T> right;
        
        //Node constructor
        public Node(T item){
            this.item = item;
            this.left = null;
            this.right = null;
        } 
        //getters and setters
        public T getItem(){
            return this.item;
        }
        public void setItem(T item){
            this.item = item;
        }
        public Node<T> getLeft(){
            return this.left;
        }        
        public void setLeft(T item){
            this.left = new Node<T>(item);
        }
        public Node<T> getRight(){
            return this.right;
        } 
        public void setRight(T item){
            this.right = new Node<T>(item);
        }  
        //helper methods
        public boolean isLeaf(){
            if (this.right == null && this.left==null){
                return true;
            }
        }
    } //end of Node class 
} //end of BinaryTree class