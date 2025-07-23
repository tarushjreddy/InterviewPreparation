
public class MergeSort {

    public static void main(String[] args) {
        int nums[] = {5, 4, 2, 16, 8, 9};
        findmergersort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void findmergersort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            findmergersort(nums, l, mid);
            findmergersort(nums, mid + 1, r);

            merge(nums, l, mid, r);
        }

        // TODO Auto-generated method stub
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int l1[] = new int[n1];
        int l2[] = new int[n2];

        for (int x = 0; x < n1; x++) {
            l1[x] = nums[l + x];
        }
        for (int x = 0; x < n2; x++) {
            l2[x] = nums[mid + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (l1[i] <= l2[j]) {
                nums[k] = l1[i];
                i++;
            } else {
                nums[k] = l2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = l1[i];
            i++;
            k++;

        }
        while (i < n2) {
            nums[k] = l2[j];
            j++;
            k++;
        }

    }

}
