
public class slectionSortdec {

    public static void main(String[] args) {
        int nums[] = {6, 5, 32, 1, 4, 6, 2};
        int maxIndex = -1;
        System.out.println("Before Selection Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("length of array "+nums.length+"");
            maxIndex = i;
            for (int j = i + 1; j < nums.length - i; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
            }
           

        }
        System.out.println();
        System.out.println("After Selection Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
