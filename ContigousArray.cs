// Time Complexity : O(n), we need to traverse the input from 1 to n
// Space Complexity : O(n), we are saving values in hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/contiguous-array/
    public int FindMaxLength(int[] nums) {
        
        if(nums == null || nums.Length == 0)
            return 0;
        
        Dictionary<int, int> map = new Dictionary<int, int>();
        map.Add(0, -1);
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < nums.Length; i++)
        {
            if(nums[i] == 0)
                count--;
            else
                count++;
            
            if(!map.ContainsKey(count))
                map.Add(count, i);
            else
            {
                int currentMax = i - map[count];
                if(currentMax > max)
                    max = currentMax;
            }
        }
        
        return max;
    }