class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean>  register = new HashMap<Integer, Boolean>();
        for (int num : nums){
            if (register.getOrDefault(num, false)){
                return true;
            }
            register.put(num, true);
        }
        return false;
    }
}