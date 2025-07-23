
public class LinearSearch {

    public static void main(String[] args) {
        int nums[] = {3, 2, 4, 5, 6, 67};
        System.out.println("Printing the arrays before");
        int target = 69;
        int result = FindLinearSearch(nums, target);
        if (result != -1) {
            System.out.println("Element Found at index " + result);
        } else {
            System.out.println("Element is not present");
        }
    }

    public static int FindLinearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

}
