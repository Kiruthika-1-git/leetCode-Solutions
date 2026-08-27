class Solution {
    public int subarraysDivByK(int[] nums, int k) {
           int leftsum=0;
           int count=0;
           int divi=0;
           int rem=0;
           int[] rep=new int[k];
           rep[0]=1;
           for(int i=0;i<nums.length;i++)
           {
            divi=nums[i]+leftsum;
            rem=(divi%k+k)%k;
            count=count+rep[rem];
            rep[rem]++;
            leftsum=leftsum+nums[i];                    
            }     
    return count;
    }

}