//Time Complexity:O(n) n->length of pattern String
//Space complexity:O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i=0;
        String[] words = s.split(" ");
        Map<Character,String> map=new HashMap();
        Set<String> set=new HashSet();
        if(pattern.length()!=words.length) return false;
        while(i!=pattern.length()){
            Character c=pattern.charAt(i);
            if(!map.containsKey(c)){
                if(set.contains(words[i]))return false;
                map.put(c,words[i]);
                set.add(words[i]);
            }
            else{
                if(!map.get(c).equals(words[i]))return false;
            }
            i++;
        }
        return true;
    }
}