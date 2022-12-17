class Solution {
    public void sortColors(int[] nums) {
        int zcount =0;
        int ocount=0;
        //int index=0;
        //int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zcount++;
            }
            else if(nums[i]==1){
                ocount++;
            }
        }
        for(int i=0;i<zcount;i++){
            nums[i]=0;
        }
        for(int i =zcount;i<ocount+zcount;i++){
            nums[i]=1;
        }
        for(int i=ocount+zcount;i<nums.length;i++){
            nums[i]=2;
        }
        //System.out.println(Arrays.toString(arr));
        //for(int i=0;i<nums.length;i++){
            //nums[i]=arr[i];
        //}
    }
}
