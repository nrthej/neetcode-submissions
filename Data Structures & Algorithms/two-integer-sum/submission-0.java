class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> register = new HashMap<Integer, Integer>();

        for ( int i=0; i< nums.length; i++){
            if(register.containsKey(target - nums[i])){
                return new int [] {register.get(target - nums[i]), i};
            }
            register.put(nums[i], i);
        }
        return new int[] {};
    }
}
