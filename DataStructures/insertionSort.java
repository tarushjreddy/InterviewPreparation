
public class insertionSort {
    public static void main(String[] args) {
        int nums[] = {9, 6, 7, 8, 9};
        int[] result = InsertionSort(nums);
        System.out.println("Sorted Array using insertion sort");
        for (int num : result) {
            System.out.print(num);
        }

    }

    public static int[] InsertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            System.out.println("Before while loop" + " value of i " + i + " Value of j" + j);
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                System.out.println("in while loop" + " value of i " + i + " Value of j " + j);
                j--;
            }
            System.out.println("After while loop" + " value of i " + i + " Value of j " + j);
            nums[j + 1] = key;
        }
        return nums;
    }

}
