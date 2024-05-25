import java.util.HashMap;

//Time Complexity - o(n) - run through entire array once
//Space Complexity - 0(n) - storing sum for all n elements
// approach
// Running sum approach with hashmap
// add rSum=0 as 1 occurance. int count =0;
//continue traversing through the array calculate running sum. if sum exists in the map increament.
// if sum-k exists in map increament count by 1.

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;

        int rSum =0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(rSum, 1);
        for(int i=0;i<nums.length;i++){
            rSum = rSum+nums[i];
            if(map.containsKey(rSum-k)){
                count = count +map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return count;

    }
}
