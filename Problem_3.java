// Time Complexity : O(n)
// Space Complexity :O(2n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// make two hashmap to store the pattern to the string and string to the pattern, and if found different return false
// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] strArr = s.split(" ");
        if(pattern.length() != strArr.length) return false;
        HashMap <Character, String> hm = new HashMap <>();
        HashMap <String, Character> strHm = new HashMap <>();
        for( int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!strArr[i].equals(hm.get(ch))) return false;
            }else{
                hm.put(ch,strArr[i]);
            }
            if(strHm.containsKey(strArr[i])){
                if(strHm.get(strArr[i]) != ch) return false;
            }else{
                strHm.put(strArr[i],ch);
            }
        }
        return true;
    }
}