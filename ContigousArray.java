import java.util.HashMap;
//Time Complexity - o(n)
//Space Complexity - 0(n)
//Approach
// Finding running sum. by adding -1 if its 0 and 1 if its 1.
// Start putting it in hasmap along with its index.
//if I already find rSum in hash map - calculate the max by comparing
// current max and the i- map.get(rSum) ( THe earlier index where the same rsum was found)
//At the end return max.

public class ContigousArray {

    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        //key - running sum
        //value is index of running sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum =0;
        int max =0;
        // base case
        map.put(rSum, -1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                rSum=rSum+1;
            }else {
                rSum = rSum-1;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }else{
                map.put(rSum, i);
            }
        }
        return max;

    }
}
