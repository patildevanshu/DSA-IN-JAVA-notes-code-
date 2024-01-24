package strings;

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
    }    public static void main(String[] args) {
        String name = "devanshu";
        System.out.println(name);
        System.out.println(ispalindrome(name));
        String dirc = "nsew";
        System.out.println(getshortestpath(dirc));
        String str = "Devanshu patil";
        System.out.println(substring(str, 0, 10));
    } 
}  
