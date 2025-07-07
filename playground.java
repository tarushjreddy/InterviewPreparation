
import java.util.Scanner;

public class playground {

    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        Scanner typeInput = new Scanner(System.in);
        String type = typeInput.nextLine();
        int res = findSolution(nums, target, type);
        if (res == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("Element is present in this position of the nums " + res + " where the value for nums is " + nums[res]);
        }
    }

    public static int findSolution(int[] nums, int target, String type) {
        int right = nums.length - 1;
        int left = 0;
        if ("Linear".equals(type)) {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    return i;
                }
            }
            return -1;
        } else if ("Binary".equals(type)) {

            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
        return -1;
    }
}
