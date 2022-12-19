int findMaxConsecutiveOnes(int* nums, int numsSize){
    int Count=0;
    int maxCount=0;
    
    for(int i=0;i<numsSize;i++){
        if(nums[i]==1){
            Count++;
        }else{
            Count=0;
        }
        if(maxCount<Count){
            maxCount=Count;
        }
    }
    return maxCount;
}
