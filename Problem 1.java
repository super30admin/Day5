// Time Complexity : O(nm) where n is total words and m is lenght of every word.
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


class Solution {
    
    private String createCode(String s){
        int[] arr = new int[26]; //array to store frquency of letters
        StringBuilder st = new StringBuilder();
        
        for(char c: s.toCharArray()){
            arr[c-97]++;
        }
        
        st.append("#");
        
        for(int i=0; i<arr.length; i++){ // creating a unique string code
            st.append(arr[i]);
            st.append("#");
        }
        return st.toString();
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>(); //to store each word with same code together
        
        for(String s: strs){
            String code = createCode(s);
            if(!map.containsKey(code)){
                map.put(code, new LinkedList());
            }
            map.get(code).add(s);
        }
        
        for(String key: map.keySet()){
            out.add(map.get(key));
        }
        
        return out;
    }
}