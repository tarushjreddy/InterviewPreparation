public class BubbleSort {
    public static void main(String[] args){
        int nums[] = {6,5,32,1,4,6,2};
        System.out.print("Printing it before sorting ");
        for(int num : nums){
            System.out.print(num+" ");
        }
        // Your code 
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.print("\nPrinting it after sorting ");
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}