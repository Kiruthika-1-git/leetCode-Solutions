int searchInsert(int* nums, int numsSize, int target) {
    int left=0;
    int right=numsSize-1;
    int mid=(left+right)/2;
    int found=0;
    while(left<right)
    {
        if(nums[left]==target)
        {
            found=1;
            return left;
        }
        left++;
    }
    if(found==0)
    {
       
                left = 0;
        right = numsSize - 1;

        while(left<=right)
        {
            mid = (left + right) / 2;        
         
             if(nums[mid]<target)
            {
             left=mid+1;  

            }
            else {
               right=mid-1;
            }
        }
return left;
    }
    return 0;
    
}
