import java.util.*;

class ecommarce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter product prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        System.out.println("Prices in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}