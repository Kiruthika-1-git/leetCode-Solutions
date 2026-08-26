class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];

        int pro = 1;

        for(int i = 0; i < nums.length; i++) {

            arr[i] = pro;
            pro = pro * nums[i];
        }

        pro = 1;

        for(int i = nums.length - 1; i >= 0; i--) {

            arr[i] = arr[i] * pro;

            pro = pro * nums[i];
        }

        return arr;
    }
}