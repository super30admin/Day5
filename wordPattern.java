// Time Complexity :O(2n) -> O(n) - where n is the length of both of the strings.
// Space Complexity : O(52) - constant space because only lowercase characters in the two hashmaps.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We use the concept of form code for comparing the strings.

class Solution {
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        char[] p=pattern.toCharArray();
        //base condition.
        if(p.length!=strs.length) {
            return false;
        }
     
        Map<Character,Long> hmap=new HashMap<Character,Long>();
        Map<Long,Character> smap=new HashMap<>();
        for(int i=0;i<p.length;i++){
           
            if(!hmap.containsKey(p[i])){
                long val=primeCode(strs[i]);
                if(smap.containsKey(val)) return false;
                hmap.put(p[i],val);
                smap.put(val,p[i]);       
            }
            else{
                long s=primeCode(strs[i]);
                if(s!=hmap.get(p[i])) return false;
                }
        }
        return true;
    }
    private long primeCode(String s){
        long result=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            result=result*primes[c-'a'];
        }
        return result;
    }
}