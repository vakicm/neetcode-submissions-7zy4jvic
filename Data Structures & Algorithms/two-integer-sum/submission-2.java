class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nNiz = new int[2]; // elementi u koje pakujem ove koji mi odgovaraju
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
