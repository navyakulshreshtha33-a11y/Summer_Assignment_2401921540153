  class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j-i]+nums[j]==target)
                {
                    a[0]=j-i;
                    a[1]=j;
                    return a;
                }
                
            }
        }
        return a;
    }
}
