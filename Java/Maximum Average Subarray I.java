class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double avg=0;
        double maxavg=0;
       for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
            avg= (double) sum/k;
        }
        maxavg=avg;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            avg= (double) sum/k;
            if(avg>maxavg)
            {
                maxavg=avg;
            }
        }
        return maxavg;
    }
}