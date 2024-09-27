/*
    Time Complexity : O(n)
    Space Complexit : O(n)
    Accepted LeetCode URL : https://leetcode.com/submissions/detail/636646941/
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }
            
            if(map.containsKey(fmap)==false){
                ArrayList<String> list  = new ArrayList<>();
                list.add(str);
                map.put(fmap, list);
            }else{
                ArrayList<String> list = map.get(fmap);
                list.add(str);
                map.put(fmap, list);
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> list : map.values()){
            res.add(list);
        }
        
        return res;
    }
}
