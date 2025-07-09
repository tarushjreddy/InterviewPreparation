public class BinarySearch {
    public static void main(String[] args) {
        int nums[]= {5,6,7,8,9};
        int target = 8;
        int result = FindBinarySearch(nums,target);
        if (result != -1) {
            System.out.println("Element Found at index " + result);
        } else {
            System.out.println("Element is not present");
        }
    }
    public static int FindBinarySearch(int nums[],int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    
}
