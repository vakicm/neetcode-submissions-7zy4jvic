class Solution {
    public int[] getConcatenation(int[] nums) {
        int index = 0; //broji elemente
        int[] nNiz = new int[nums.length * 2]; // inicijalizujem nov niz na dimenzije dva puta vece od prethodnog 
        for(int i = 0; i < 2; i++){ // inicijalizujem globalno nizove tj kazem da se pod niz ponavlja 2 puta. Da hocu da imam po 3 duplikata u nizu rekao bih i < 3
            for(int j = 0; j < nums.length; j++){
                nNiz[index++] = nums[j];
            }
        }
        
        return nNiz;
    }
}