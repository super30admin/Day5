class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        int count=0;
        
        int rSum=0;
        
        for(int i=0;i<nums.length;i++){
            rSum=rSum+nums[i];
            int cmp=rSum-k;
            
            if(map.containsKey(cmp)){
                count=count+map.get(cmp);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
        
    }
}