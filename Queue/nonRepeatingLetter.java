package Queue;
import java.util.*;
public class nonRepeatingLetter {
// first Non Repeating letter in a stream of characters.
// if stream come in Question then there is 90% chances of use of Queue
    public static void printNonRepeating(String str){
        int freq[] = new int[26];
        Queue <Character> q = new LinkedList<>();

        for(int i =0; i<str.length() ; i++){
            char ch =str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a']>1) {
                q.remove();
            }

            if (q.isEmpty()){
                System.out.println(-1 + " ");
            }
            else{
                System.out.println(q.peek() + " ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
