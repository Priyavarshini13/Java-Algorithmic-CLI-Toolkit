import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n================================");
            System.out.println("     JAVA ALGORITHMIC TOOLKIT");
            System.out.println("================================");
            System.out.println("1. Searching");
            System.out.println("2. Sorting");
            System.out.println("3. String Algorithms");
            System.out.println("4. Exit");

            int choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:
                    searchingMenu();
                    break;

                case 2:
                    sortingMenu();
                    break;

                case 3:
                    stringMenu();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose 1-4.");
            }
        }
    }

    // Safe integer input
    static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }

    static void searchingMenu() {

        int[] arr = {10, 20, 30, 40, 50};

        int target = readInt("Enter element to search: ");

        System.out.println("\n1. Linear Search");
        System.out.println("2. Binary Search");

        int choice = readInt("Choose algorithm: ");

        int result;

        if (choice == 1) {

            result = SearchAlgorithms.linearSearch(arr, target);

            System.out.println("\nAlgorithm: Linear Search");
            System.out.println("Time Complexity: O(n)");
            System.out.println("Space Complexity: O(1)");

        } else if (choice == 2) {

            result = SearchAlgorithms.binarySearch(arr, target);

            System.out.println("\nAlgorithm: Binary Search");
            System.out.println("Time Complexity: O(log n)");
            System.out.println("Space Complexity: O(1)");

        } else {

            System.out.println("Invalid algorithm choice!");
            return;
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }

    static void sortingMenu() {

        int[] arr = {50, 20, 40, 10, 30};

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");

        int choice = readInt("Choose algorithm: ");

        if (choice == 1) {

            SortAlgorithms.bubbleSort(arr);

            System.out.println("\nAlgorithm: Bubble Sort");
            System.out.println("Time Complexity: O(n²)");
            System.out.println("Space Complexity: O(1)");

        } else if (choice == 2) {

            SortAlgorithms.mergeSort(arr, 0, arr.length - 1);

            System.out.println("\nAlgorithm: Merge Sort");
            System.out.println("Time Complexity: O(n log n)");
            System.out.println("Space Complexity: O(n)");

        } else {

            System.out.println("Invalid algorithm choice!");
            return;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void stringMenu() {

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("\n1. Reverse");
        System.out.println("2. Check Palindrome");

        int choice = readInt("Choose operation: ");

        if (choice == 1) {

            System.out.println("Reversed: "
                    + StringAlgorithms.reverse(str));

        } else if (choice == 2) {

            boolean result =
                    StringAlgorithms.isPalindrome(str);

            System.out.println("Palindrome: " + result);

        } else {

            System.out.println("Invalid operation!");
        }
    }
}