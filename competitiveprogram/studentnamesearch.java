
    import java.util.Scanner;

public class studentnamesearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.println("Enter student names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        boolean foundSensitive = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equals(searchName)) {
                System.out.println("Case-sensitive: Found at position " + (i + 1));
                foundSensitive = true;
            }
        }

        if (!foundSensitive) {
            System.out.println("Case-sensitive: Student not found");
        }
        boolean foundInsensitive = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Case-insensitive: Found at position " + (i + 1));
                foundInsensitive = true;
            }
        }

        if (!foundInsensitive) {
            System.out.println("Case-insensitive: Student not found");
        }
    }
}

