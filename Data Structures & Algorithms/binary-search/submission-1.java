class Solution {
    public int search(int[] nums, int target) {
        int brojac = -1;
        for(int i = 0; i < nums.length; i++){
            brojac++;
            if(nums[i] == target){
                return brojac;
            }
        }
        return -1;
    }
}
