/**
 * Test program to compare custom LinkedList to Java built-in LinkedList
 * @author ICS4U
 * @version Oct 2019
 */
import java.util.LinkedList;

public class CompleteTester {
    public static void main(String[] args) throws Exception {
        final int MAX = 10000;
        final int ADD = 0;
        final int REMOVE_INDEX = 1;
        final int REMOVE_ITEM = 2;
        final int SIZE = 3;
        final int NUM_METHODS = 4;
        
        int countAdd = 0;
        int countRemoveByIndex = 0;
        int countRemoveByT = 0;
        int countSize =0;
        
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        LinkedList<String> listShadow = new LinkedList<String>();
        
        for (int i = 0; i < MAX; i++) {
            int oper = (int) (NUM_METHODS * Math.random());
            if (oper == ADD){
                list.add(Integer.toString(i));
                listShadow.add(Integer.toString(i));
                countAdd++;
            }else if (oper == REMOVE_INDEX){
                if (list.size() != 0) {
                    int removeIndex = (int) ((list.size() - 1) * Math.random());
                    list.remove(removeIndex);
                    listShadow.remove(removeIndex);
                    countRemoveByIndex++;
                }
            }else if (oper == REMOVE_ITEM){
                if (i != 0) {
                    int removeT = (int) ((MAX - 1) * Math.random());
                    if(list.remove(Integer.toString(removeT))){
                        countRemoveByT++;
                    }
                    listShadow.remove(Integer.toString(removeT));
                }
            }else if (oper == SIZE){
                if (i != 0){
                    list.size();
                    listShadow.size();
                    countSize++;
                }
            }
        }
        
        //compare data in the two lists
        int countSameValue = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(listShadow.get(i)) == 0){
                countSameValue++;
            }
        }
        System.out.println("Same data score: " + countSameValue + "/" + list.size());
        
        //compare index of found items
        int countSameIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(Integer.toString(i)) == listShadow.indexOf(Integer.toString(i))) {
                countSameIndex++;
            }
        }
        System.out.println("Same indexOf score: " + countSameIndex + "/" + list.size());
        
        System.out.println();
        System.out.println(countAdd + " add operations.");
        System.out.println(countRemoveByIndex + " remove by index operations.");
        System.out.println(countRemoveByT + " remove by T operations.");
        System.out.println(countSize + " size operations.");
        System.out.println();
        
        System.out.println(list);
        System.out.println();
        System.out.println(listShadow);
    }
}
