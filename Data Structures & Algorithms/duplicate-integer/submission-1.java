class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> register = new HashSet<Integer>();

        for (int num: nums){
            if (!register.add(num)){
                return true;
            }
        }
        return false;
    }
}