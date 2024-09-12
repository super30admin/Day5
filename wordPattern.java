/*Leetcode 290
Time Complexity : O(n) //n length of pattern
Space Complexity : O(n)
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map1.get(ch) == null){
                map1.put(ch,words[i]);
                if(map2.get(words[i]) == null){
                    map2.put(words[i],ch);
                }else{
                    if(map2.get(words[i]) != ch){
                        return false;
                    }
                }
            }else{
                if(!map1.get(ch).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}