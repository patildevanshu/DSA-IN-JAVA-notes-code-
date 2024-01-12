package functn;

public class bitodec {
    public static int btd(int n){
        int mynum = n;
        int pow = 0;
        int decimalno = 0;

        while (n>0){
            int lastdigit = n % 10;
            decimalno = decimalno  +( lastdigit * (int) Math.pow(2,pow));
            n = n/10;
            pow++;

        } 
        System.out.println(decimalno);
        return decimalno;

    }
    public static void main(String args[]){
        btd(1001);
    }
}
