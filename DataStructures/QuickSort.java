
public class quickSort {

    private static void findquickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = pivotHandler(nums, low, high);
            findquickSort(nums, low, pi -1);
            findquickSort(nums, pi + 1, high);
        }
    }

    private static int pivotHandler(int[] nums, int low, int high) {
        int pi = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pi) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int nums[] = {5, 4, 2, 16, 8, 9};

       findquickSort(nums, 0, nums.length - 1);

        for(int num : nums){
            System.out.print(num+ " ");
        }
    }

}
