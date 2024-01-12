import java.util.Scanner;

import Java.util.*;
public class javainput {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // next is used for input single word. we input ' tony stark'. output will be 'tony'
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int a = sc.nextInt();
        System.out.println(a);

        float b = sc.nextFloat();
        System.out.println(b);

        boolean con = sc.nextBoolean();
        System.out.println(con);

        short u =sc.nextShort();
        System.out.println(u);
  
        byte x =sc.nextByte();
        System.out.println(x);

    }

}
