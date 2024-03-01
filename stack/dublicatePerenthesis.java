package stack;

import java.util.Stack;

public class dublicatePerenthesis {
    // Duplicate Parentheses
    // Given a balanced expression, find if it contains duplicate parentheses or
    // not. A set of parentheses are duplicate if the same subexpression is
    // surrounded by multiple parentheses.
    // Return a true if it contains duplicates else return false.

    // example : (((a+(b)))+(c+d))
    // true
    // example: ((((a)+(b))+c+d))
    // true
    // example : ((a + b) + (c + d))
    // false
    // example: (((a+b))+c)
    // true

    // -------------------------------------------------------------------
    // O(n)
    public static boolean isDublicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a+b)"; // false

        System.out.println(isDublicate(str));
        System.out.println(isDublicate(str2));

    }

}
