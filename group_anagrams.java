//time: O(NMlog(n) -> log(n) for sort; N for the size of the input array; M for each string size
//space: O(NM)
//Appraoch:


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> anagrams = new ArrayList<List<String>>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String key = String.valueOf(s);
            if(!hm.containsKey(key)){
                 List<String> temp = new ArrayList<>();
                
                hm.put(key,temp);
              
            } 
            hm.get(key).add(str);
        }
        
        // for(int i =0;i<hm.size();i++){
        //     anagrams.add(hm.get(i));
        // }
        return new ArrayList(hm.values());
    }
}