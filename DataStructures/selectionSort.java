
public class selectionSort {

    public static void main(String[] args) {
        int nums[] = {6, 5, 32, 1, 4, 6, 2};
        int minIndex = -1;
        System.out.println("Before Selection Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println();
        System.out.println("After Selection Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
