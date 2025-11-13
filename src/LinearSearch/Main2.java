package LinearSearch;

public class Main2 {
    public static int linearSearch(int[] arr, int key) {
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // If element is found, return its index
            if (arr[i] == key) {
                return i;
            }
        }
        // If not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;

        int result = linearSearch(numbers, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
