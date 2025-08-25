import java.util.Scanner;
import java.util.Arrays;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[100];
        int count = 0;

        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            numbers[count] = val;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
            return;
        }

        int[] data = Arrays.copyOf(numbers, count);

        double mean = findMean(data, count);
        double median = findMedian(data, count);
        int mode = findMode(data, count);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static double findMean(int[] nums, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        return sum / size;
    }

    public static double findMedian(int[] nums, int size) {
        Arrays.sort(nums);
        if (size % 2 == 0) {
            return (nums[size / 2 - 1] + nums[size / 2]) / 2.0;
        } else {
            return nums[size / 2];
        }
    }

    public static int findMode(int[] nums, int size) {
        int mode = nums[0];
        int maxCount = 0;

        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums[i];
            }
        }
        return mode;
    }
}
