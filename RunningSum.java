public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = (nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    
}
