// Time Complexity Iterating => O(N) and sorting every string K Log K, total O(N Klog(K))
// Space Complexity - O(NK)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(int i=0;i<strs.length;i++) {
            char tempArray[] = strs[i].toCharArray(); 
            Arrays.sort(tempArray);
            String str = new String(tempArray);
            
            if(map.containsKey(str)) {
                List<String> list = map.get(str);
                list.add(strs[i]);
                map.put(str, list);
            }
            else {
                map.put(str, new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        
        return res;
    }
}
