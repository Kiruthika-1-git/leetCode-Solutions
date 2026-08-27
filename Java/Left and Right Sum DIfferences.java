class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftarr=new int[nums.length];
        int[] rightarr=new int[nums.length];
        int[] resultarr=new int[nums.length];
        int leftsum=0;
        int rightsum=0;
        int current=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            current=nums[i];
            leftarr[i]=leftsum;
            rightsum=total-current-leftsum;
            rightarr[i]=rightsum;
            leftsum=leftsum+nums[i];
        }        
        for(int i=0;i<nums.length;i++)
        {
            resultarr[i]=Math.abs(leftarr[i]-rightarr[i]);
        }
        return resultarr;
    }
}     