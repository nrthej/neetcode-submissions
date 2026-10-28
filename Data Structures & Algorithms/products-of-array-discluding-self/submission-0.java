class Solution {
    public int[] productExceptSelf(int[] nums) {

        int j = nums.length;
        int[] leftMultiplication = new int[j];
        int[] rightMultiplication = new int[j];
        leftMultiplication [0] =1;
        j--;
        rightMultiplication[j]=1;
        for (int i= 1  ; i< nums.length ; i++){
            j--;
            leftMultiplication [i] = leftMultiplication[i-1]* nums[i-1];
            rightMultiplication[j]= rightMultiplication[j+1] * nums[j+1];
        }
        for (int i=0; i< nums.length; i++){
            leftMultiplication [i] = leftMultiplication[i]*rightMultiplication[i];
        }
        return leftMultiplication;
    }
}  
