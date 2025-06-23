public class LeetRemoveDup {
    public static void main(String[] args) {
        public int RemoveDup(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int uniqueIndex = 0; // Pointer for the position of unique elements
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[uniqueIndex]) {
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
                }
            }
            return uniqueIndex + 1; // Length of the array with unique elements
        }
        int nums[]={0,0,1,1,1,2,2,3,3,4}; 
        LeetRemoveDup obj = new LeetRemoveDup();
        obj.RemoveDup(nums);
        System.out.println("Length of array with unique elements: " + obj.RemoveDup(nums));
    }
}
