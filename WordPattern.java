// Time Compexity  - O(l) where l is length of the pattern
// Space Complexity - O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splitArr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if(pattern.length() != splitArr.length) return false;
        for(int i=0; i< pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(splitArr[i])) return false;
                map.put(pattern.charAt(i), splitArr[i]);
                set.add(splitArr[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(splitArr[i])){
                    return false;
                }
            }
        }
        return true;
        
    }
}
