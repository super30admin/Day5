//time complexity: O(n) - Length of pattern;
//Space complexity: O(n) 


class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String[] words = str.split(" ");
        if(pattern.length()!=words.length) {
            return false;
        }
        for(int i=0;i<words.length;i++){
            char c1=pattern.charAt(i);
            if(!map.containsKey(c1)){
                if(set.contains(words[i])){
                    return false;
                }
                map.put(c1,words[i]);
                set.add(words[i]);
            }
            else{
                if(!map.get(c1).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}