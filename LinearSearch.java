public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
