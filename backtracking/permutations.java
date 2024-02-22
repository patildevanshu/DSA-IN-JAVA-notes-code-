package backtracking;

public class permutations {
    public static void findpermutations( String str , String ans){
        // base case 
        // time coplexity O(n*n! )
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i =0; i<str.length() ; i++){
            char curr = str.charAt(i);
            // "abcde" = "ab " + "cd"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findpermutations(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findpermutations(str, "");
    }
}
