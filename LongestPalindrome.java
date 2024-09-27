//TC: O(N) travelling once with HashSet
//SC: O(1) as only 26 lowercase alphabets will be present
//Running: yes

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            //Adding 2 elements to the count and removing the element from the hashSet;
            
            if(set.contains(curr)){
                set.remove(curr);
                count=count+2;
            }else{
                set.add(curr);
            }
        }
        if(!set.isEmpty()){
            count=count+1;
        }
        return count;
    }
}
