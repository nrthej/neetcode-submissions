class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length())
            return false;
        char [] charA1= s.toCharArray();
        char [] charA2 = t.toCharArray();
        Arrays.sort(charA1);
        Arrays.sort(charA2);
        
        for (int i =0 ; i< s.length(); i++){
            if (charA1[i] != charA2[i]){
                return false;
            }
        }

        return true;
    }
}
