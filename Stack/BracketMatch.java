public class BracketMatch {
    public static void main(String[] args) {
        String st1 = "{({})}";
        String st2 = "{}([])[]";
        String st3 = "{)]({}";
        System.out.println(isMatch(st1));
        System.out.println(isMatch(st2));
        System.out.println(isMatch(st3));
    }

    public static boolean isMatch(String st) {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < st.length(); i++) {
            char next = st.charAt(i);
            if (brackets.isEmpty()
                || !((next == ')' && brackets.peek() == '(')
                || (next == ']' && brackets.peek() == '[')
                || (next == '}' && brackets.peek() == '{'))) {
                brackets.push(next);
            } else {
                brackets.pop();
            }
        }
        return brackets.isEmpty();
    }
}
