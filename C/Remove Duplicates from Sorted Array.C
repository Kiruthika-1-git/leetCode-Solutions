int removeDuplicates(int* nums, int numsSize) {
    int count=0;
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[i]==nums[j])

            {
                for(int k=j;k<numsSize-1;k++)
                {
                    nums[k]=nums[k+1];
                   
                }
                 numsSize--;
                 j--;
            }
        }
    }
    for(int i=0;i<numsSize;i++)
    {
        count=count+1;
    }
    return count;
}
