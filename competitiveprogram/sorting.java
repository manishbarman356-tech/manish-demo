import java.util.Scanner;

public class sorting {
    static void bubbleSort(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 0; j < prices.length - 1 - i; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }
    }
    static void selectionSort(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[min]) {
                    min = j;
                }
            }

            int temp = prices[i];
            prices[i] = prices[min];
            prices[min] = temp;
        }
    }
    static void insertionSort(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            int key = prices[i];
            int j = i - 1;

            while (j >= 0 && prices[j] > key) {
                prices[j + 1] = prices[j];
                j--;
            }

            prices[j + 1] = key;
        }
    }
    static void display(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int[] bubble = prices.clone();
        int[] selection = prices.clone();
        int[] insertion = prices.clone();
        bubbleSort(bubble);
        System.out.println("Bubble Sort:");
        display(bubble);
        selectionSort(selection);
        System.out.println("Selection Sort:");
        display(selection);
        insertionSort(insertion);
        System.out.println("Insertion Sort:");
        display(insertion);

        sc.close();
    }
}
