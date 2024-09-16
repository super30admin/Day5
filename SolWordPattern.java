// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class SolWordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] myString = s.split(" ");
        if(myString.length != pattern.length()) return false;

        for(int i = 0; i<pattern.length(); i++){
            char cPattern = pattern.charAt(i);
            String str = myString[i];

            if(!map.containsKey(cPattern)){
                if(set.contains(str)){
                    return false;
                }else {
                    map.put(cPattern,str);
                    set.add(str);
                }
            } else {
                if(!map.get(cPattern).equals(str)) return false;
            }
        }
        return true;
    }
}