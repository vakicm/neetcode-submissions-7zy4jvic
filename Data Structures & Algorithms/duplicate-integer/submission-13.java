class Solution {
    
    public boolean hasDuplicate(int[] nums) {
        
        Set <Integer> vidjen = new HashSet<>();
        // HashSet je tip podatka gde je svaki element jedinstven. 
        // To znaci da ja sad pravim promenljivu vidjen koja mora biti jedinstvena i 
        // ukoliko svaki element u nizu nije tacan, on ce vratiti true. Ukoliko nema takvih - vrati false.
        for (int i = 0; i < nums.length; i++){
            if(!vidjen.add(nums[i])){
                return true;
            }
        }
    return false;
    }
}