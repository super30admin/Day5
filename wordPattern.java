//the brute force approach results in an inevitable time complexity of O(n^2).
/*while usage of hashmap for mapping pattern and usage of hashset for non repetitiveness of the s values significantly reduced the time
complexity to O(n) at the cost of space complexity being O(n).*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> h = new HashSet<>();
        String []strs = s.split(" ");
        if(strs.length!=pattern.length()) return false;
        for(int i=0;i<strs.length;i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!(strs[i]).equals(hm.get(pattern.charAt(i)))) return false;
                continue;
            }else if(h.contains(strs[i])){
                return false;
            }
            hm.put(pattern.charAt(i),strs[i]);
            h.add(strs[i]);
        }
        return true;
    }
}
