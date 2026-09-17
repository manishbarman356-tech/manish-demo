import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        boolean valid = true;
        if (code.length() != 12) {
            valid = false;
        } else {
            for (int i = 0; i < 3; i++) {
                if (!(code.charAt(i) >= 'A' && code.charAt(i) <= 'Z')) {
                    valid = false;
                }
            }
            if (code.charAt(3) != '-') {
                valid = false;
            }
            for (int i = 4; i <= 7; i++) {
                if (!(code.charAt(i) >= '0' && code.charAt(i) <= '9')) {
                    valid = false;
                }
            }
            if (code.charAt(8) != '-') {
                valid = false;
            }
            for (int i = 9; i <= 11; i++) {
                if (!(code.charAt(i) >= '0' && code.charAt(i) <= '9')) {
                    valid = false;
                }
            }
        }

        if (valid) {
            System.out.println("Valid book code");
        } else {
            System.out.println("Invalid book code");
        }
    }
}
