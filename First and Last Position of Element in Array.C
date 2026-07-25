/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {

    *returnSize = 2;

    int *arr = (int *)malloc(2 * sizeof(int));

    arr[0] = -1;
    arr[1] = -1;

    for(int i = 0; i < numsSize; i++)
    {
        if(nums[i] == target)
        {
            if(arr[0] == -1)
            {
                arr[0] = i;      // First occurrence
            }

            arr[1] = i;          // Last occurrence
        }
    }

    return arr;
}