import java.util.Scanner;

public class Solution {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit
        }
        return sum;
    }

    // Function to find the smallest index where digit sum equals index
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumOfDigits(nums[i]) == i) {
                return i; // Return the index if condition is met
            }
        }
        return -1; // Return -1 if no index is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (space-separated):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.smallestIndex(nums);
        if (result == -1) {
            System.out.println("No index found where digit sum equals the index.");
        } else {
            System.out.println("Smallest index: " + result);
        }

        scanner.close();
    }
}
