/**
 * Simple Queue Tester
 * @author ICS4U
 * @version Nov 2019
 */
public class SimpleQueueTester {
    public static void main(String[] args) {
        SimpleQueue<Integer> q = new SimpleQueue<Integer>();
        
        System.out.println("\n                   front                  back");
        for (int i=0; i<10;i++){
            int number = (int)(Math.random()*10);
            q.enqueue(number);
            System.out.println("size= "+ q.size() +", elements: "+ q +" added: "+ number);
        }
        
        System.out.println("\n                   front                  back");
        for (int i=0; i<10;i++){
            if (!q.isEmpty()){
                int number = q.dequeue();
                System.out.println("size= "+ q.size() +", elements: "+ q +" removed: "+ number);
            }
        }        
    }
}