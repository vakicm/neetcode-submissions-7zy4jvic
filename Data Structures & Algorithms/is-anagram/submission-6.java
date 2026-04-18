class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sSort = s.toCharArray(); // ceo string pretvorim u niz karaktera
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort); // sortiram jer je lakse za poredjenje
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort); // uporedim da li su jednaki i automatski mi vraca trazenu vrednost 
    }
}
