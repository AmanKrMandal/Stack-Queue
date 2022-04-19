package Stack.Queue;

import java.util.Stack;

public class LongestParenthesis {
    public static void main(String[] args) {
        String str = "([{])}";
        if(isParenthesisMatch(str)){
            System.out.println("Balance");
        }
        else {
            System.out.println("not Balance");
        }
    }
    static  boolean isParenthesisMatch (String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if ((cur=='(' )|| (cur== '{')|| (cur=='[')){
                s.push(cur);
            }
            else {
                if(s.isEmpty()){
                    return false;
                }
                else if (!isMatching(s.peek(), cur)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    static boolean isMatching (char a, char b){
         return ((a == '(' && b==')') || (a =='{' && b=='}' ) || (a=='[' && b==']'));

    }
}
