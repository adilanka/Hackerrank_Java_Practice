class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> ht = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<n;i++)
        {
            if(ht.containsKey(target-nums[i]))
            {
                result[1] = i;
                result[0] = ht.get(target-nums[i]);
                return result;
            }
            ht.put(nums[i],i);
        }
        return result;
    }
}
