// Time Complexity : O(lon n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

    private int search(ArrayReader reader,int target){
        int low =0;
        int high=1;
        
        while(target>reader.get(high)){
            low = high;
            high = high * 2;
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(reader.get(mid)==target){
                return mid;
            }
            
            if(reader.get(mid)>target){
                high=mid-1;
            }else{
                low = mid +1;
            }
        }
        
        return -1;
    }

MY APPROACH:

Here we don't have length so taking low =0 high =1
First aim to find high and low for that by reader.get(high) will give element see if it is greater than target while(reader.get(high)<target) keep low to high as high element is lower than target and keep doubling high at one point you will get reader.get(high) = 234356463 or if element persont which is greater than target so now target is in between high and low 

Here do binary search normaly calculate mid and check == target and return 

Time complexity : for finding high and low multiplying high by 2 so log n and binary search on low to high means n=high-low so log n total 2(log n) means log n 






