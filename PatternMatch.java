class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashSet<String> h1 = new HashSet<String>();  
        // HashSet<String> h2 = new HashSet<String>(); 
        if(strs == null || strs.length ==0)return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
      return new ArrayList<>(map.values());
        
        
        
    }
}