public class CheckPalindrome {
    public static void main(String[] args){
        String st1 = "KAYAK";
        String st2 = "Hello";
        System.out.println(isPal(st1));
        System.out.println(isPal(st2));
    }
    public static boolean isPal(String st){
        Stack<Character> palchs = new Stack<Character>();
        for (int i = 0; i< st.length(); i++){
            palchs.push(st.charAt(i));
        }
        String reverse = "";
        while (!palchs.isEmpty()){
            reverse += palchs.pop();
        }
        if (st.equals(reverse)){
            return true;
        } else {
            return false;
        }
    }
}
