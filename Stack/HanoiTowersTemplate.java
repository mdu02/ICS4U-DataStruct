/**
 * Template for iterative solver of the Hanoi Towers problem
 * @author ICS4U
 * @version Nov 2019
 */
import java.util.Scanner;

public class HanoiTowersTemplate {
    public static void main(String[] args) {
        Stack <Integer> source = new Stack<Integer>();
        Stack <Integer> temp = new Stack<Integer>();
        Stack <Integer> dest = new Stack<Integer>();
                    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int numDisks = keyboard.nextInt();
        keyboard.close();
        for (int i=numDisks; i>0; i--){
            source.push(i);
        } 
        printTowers(source, temp, dest);
        Visualizer v = new Visualizer (source, temp, dest, numDisks);        
        
        //move the disks from source to destination using temp
        for  (int i = 0; i < Math.pow(2,numDisks)-1; i++){
            if (numDisks %2 == 0){
                if (i%3==0){
                    makeLegalMove(source, temp);
                } else if (i%3 == 1){
                    makeLegalMove(source, dest);
                } else {
                    makeLegalMove(temp, dest);
                }
            } else {
                if (i%3==0){
                makeLegalMove(source, dest);
                } else if (i%3 == 1){
                makeLegalMove(source, temp);
                } else {
                makeLegalMove(temp, dest);
                }
            }
            printTowers(source, temp, dest);
        }
    } //end of main
    
    public static void makeLegalMove(Stack<Integer> stack1, Stack<Integer> stack2){
            if ((stack2.isEmpty())||(!stack1.isEmpty()&&(Integer.compare(stack1.peek(), stack2.peek()) < 0))){
                Integer temp = stack1.pop();
                stack2.push(temp);
            } else if ((stack1.isEmpty())||(!stack2.isEmpty()&&(Integer.compare(stack1.peek(), stack2.peek()) > 0))){
                Integer temp = stack2.pop();
                stack1.push(temp);
            }
    } //end of makeLegalMove
    
    public static void printTowers(Stack<Integer> source, Stack<Integer> temp, Stack<Integer> dest){
        System.out.println("source: "+ source);
        System.out.println("temp  : "+ temp);
        System.out.println("dest  : "+ dest + "\n");
    } //end of printTowers
}
