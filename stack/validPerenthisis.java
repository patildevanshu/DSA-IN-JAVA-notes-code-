package stack;

import java.util.Stack;

public class validPerenthisis {
    // Valid Parentheses
// Given a string s containing just the characters '(', ')', '(', ')', '[' and 'I', determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.
// s = "[]{}"
// S = "(]"
// s = "0"
// S = ")("

// *--------------------------------------------------------------*

// O(n)
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length() ; i++)  {
            char ch = str.charAt(i);

            // opening
            if (ch == '('|| ch == '{' || ch == '[' ) {
                s.push(ch);
            }
            else{
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ( (s.peek() == '(' && ch == ')' )  // ()
                    || (s.peek() == '[' && ch == ']' ) //[]
                    || (s.peek() == '{' && ch == '}' ) )//{}
                    {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "([]){}[]";
        System.out.println(isValid(str));
    }


}
