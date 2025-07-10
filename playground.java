
import java.util.Scanner;

public class playground {

    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        Scanner typemethod = new Scanner(System.in);
        System.out.println("Please enter you want to perform Sorting or Searching");
        String inputmethod = typemethod.nextLine();
        if ("Searching".equals(inputmethod)) {
            Scanner typeInput = new Scanner(System.in);
            String type = typeInput.nextLine();
            typeInput.close();
            int res = findSearching(nums, target, type);
            if (res == -1) {
                System.out.println("Element is not present");
            } else {
                System.out.println("Element is present in this position of the nums " + res + " where the value for nums is " + nums[res]);
            }
        } else if ("Sorting".equals(inputmethod)) {
            System.out.println("Sorting Program Triggered");
            System.out.println("Select the type of Sorting");
          
            String typeofSort = typemethod.nextLine();

            int unsorted[] = {3, 4, 5, 6, 7, 8, 9, 10};
            int res[] = findSorting(unsorted, typeofSort);

            for (int num : res) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] findSorting(int[] nums, String type) {
        if ("Selection".equals(type)) {
            int minIndex = 0;
            for(int i =0; i<nums.length; i++){
                minIndex = i;
                for(int j=i+1; j<nums.length; j++){
                    if(nums[minIndex]>nums[j]){
                        minIndex = j;
                    }
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
            System.out.println("Sorted array using Selection Sort will be as follows");
            for(int num : nums){
                System.out.println(num);
            }

        } else if ("Bubble".equals(type)) {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static int findSearching(int[] nums, int target, String type) {
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
