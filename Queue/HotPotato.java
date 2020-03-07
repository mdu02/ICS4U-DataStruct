import java.util.Scanner;

class HotPotato {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of players");
        int numPlayers = sc.nextInt();
        System.out.println("Number of passes");
        int numPasses = sc.nextInt();
        sc.close();

        SimpleQueue<Integer> potato = new SimpleQueue<>();
        for (int i = 1; i<=numPlayers;i++){
            potato.enqueue(i);
        }
        while (potato.size() > 1){
            for (int i = 0; i<numPasses; i++){
                potato.enqueue(potato.dequeue());
            }
            int burned = potato.dequeue();
            System.out.println("Number " + burned + " was burned");
        }
        int last = potato.dequeue();
        System.out.println("Number " + last + " won!");
    }
}
