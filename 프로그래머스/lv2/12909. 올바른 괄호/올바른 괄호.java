import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}