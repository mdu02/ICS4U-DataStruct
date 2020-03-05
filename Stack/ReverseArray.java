public class ReverseArray {
    public static void main(String[] args){
        String stuff[] = new String[]{"I", "am", "infected", "with", "Coronavirus"};
        print(stuff);
        reverse(stuff);
        print(stuff);
    }
    static <E extends Comparable<E>>void print (E arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
        
    static <E extends Comparable<E>> void reverse(E arr[]){
        Stack<E>  s = new Stack<E>();
        for (int i = 0; i<arr.length; i++){
            s.push(arr[i]);
        }
        for (int i = 0; i<arr.length; i++){
            arr[i] = s.pop();
        }
    }
}
