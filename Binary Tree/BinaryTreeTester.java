/**
 * Tester program for a custom Binary Tree
 * @author ICS4U
 * @version Nov 2019
 */
import java.util.TreeSet;

public class BinaryTreeTester {
    public static void main(String[] args){
        int q4array[] = new int[]{1,3,4,5,6,7,8,9,10,12,13,15,17};
        BinaryTree<Integer> q4tree = new BinaryTree<Integer>();
        for (int i = 0; i<q4array.length;i++){
            Integer temp = new Integer(q4array[i]);
            q4tree.add(temp);
            System.out.println(q4tree);
        }
        System.out.println(q4tree);
        
        BinaryTree<String> tree = new BinaryTree<String>();
        System.out.println("\nCustom implementation");
        System.out.println(tree);
        tree.add("rhhs");
        System.out.println(tree);
        tree.add("is");
        System.out.println(tree);
        tree.add("the");
        System.out.println(tree);
        tree.add("best");
        System.out.println(tree);
        tree.add("school");
        System.out.println(tree);
        
        System.out.println("\nJava implementation");
        TreeSet<String> treeSet = new TreeSet<String>();
        System.out.println(treeSet);   
        treeSet.add("rhhs");
        System.out.println(treeSet);
        treeSet.add("is");
        System.out.println(treeSet);
        treeSet.add("the");
        System.out.println(treeSet);
        treeSet.add("best");
        System.out.println(treeSet);
        treeSet.add("school");
        System.out.println(treeSet);        
    }
}