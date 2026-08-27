class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum;
        int leftsum=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            rightsum=total-current-leftsum;
            if(rightsum==leftsum)
            {
                return i;
            }
            else
            {
                leftsum=leftsum+nums[i];
            }
        }
        return -1;
    }
}