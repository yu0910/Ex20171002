import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if (ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println("uppercase");
            System.out.println(Character.toString(ch).toLowerCase());
        } else {
            if (ch - 'a' >= 0 && ch - 'a' < 26) {
                System.out.println("lowercase");
                System.out.println(Character.toString(ch).toUpperCase());
            } else {
                System.out.println("special character");
            }
        }
    }
}
