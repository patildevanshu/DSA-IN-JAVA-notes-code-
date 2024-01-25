package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {

    public static boolean ispalindrome(String strings) {
        int n = strings.length();

        for (int i= 0; i<n/2 ; i++){
            if (strings.charAt(i) != strings.charAt(n-1-i)){
                return false;
            }
        }return true;
    }

    public static float getshortestpath( String path ){
        int x = 0 , y = 0;

        for (int i = 0 ; i<path.length(); i++){
            char dir = path.charAt(i);

            // south
            if (dir == 's' || dir == 'S'){
                y--;
            }
            else if( dir == 'n' || dir =='N'){
                y++;
            }
            else if( dir == 'w' || dir == 'W'){
                x--;
            }
            else if (dir == 'e' || dir == 'E'){
                x++;
            }
        }
        float disp =(float) Math.sqrt((x*x)+(y*y));
        return disp;
    }
    public static String substring(String str , int si , int ei){
        // String name = new String(str.substring(si, ei));
        // git
        String substr = "";
        for (int i = si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // O(n)
        for (int i = 1 ; i< str.length(); i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    } 

    public static int countlowercasevowels( String str){
        // count how many times lower case vowels occoured in string 
        int count = 0;

        for (int i = 0; i< str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i) == 'i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }


        return count;
    }

    public static boolean anagrams(String str , String str1){
    //     // if 2 strings contains the same characters but in a different order , they can be said to be anagram.
    //     // ex race & care 
    
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        boolean result = false;

        if (str.length() == str1.length()){

            

            char strarray[] =  str.toCharArray();
            char str1array[] = str1.toCharArray();

            //  sorting is very important
            Arrays.sort(strarray);
            Arrays.sort(str1array);

            result = Arrays.equals(strarray,str1array);
            if (result){
                System.out.println(str + " and " + str1 + " are anagram");
                result = true;
            }
            else{
                System.out.println(str + " and " + str1 + " are not anagram");
                result = false;
            }
        }
        else{
            System.out.println(str + " and " + str1 + " are not anagram");
            result = false;
        }
        return result;
    }
    
    public static void main(String[] args) {
         String name = "devanshu";
         String str1 = "uhsnaved";
        // System.out.println(name);
        // System.out.println(ispalindrome(name));
        // String dirc = "nsew";
        // System.out.println(getshortestpath(dirc));
        // String str = "Devanshu patil";
        // System.out.println(substring(str, 0, 10));
        // String str2 = "hii, i am devanshu patil";
        // System.out.println(toUppercase(str2));

        System.out.println(countlowercasevowels(name));
        anagrams(name, str1);



    } 
}  
