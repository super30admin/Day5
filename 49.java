class Solution {
    
    
    //Converting to char array, sorting
    //making sorted array as key and adding string as value to it.
    public List<List<String>> groupAnagrams(String[] strs) 
        {

        Map<String, List<String>> answer = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);

            if( answer.containsKey(sortedS)){
                answer.get(sortedS).add(s);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                answer.put(sortedS,list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry e : answer.entrySet()){
            res.add((List<String>)e.getValue());
        }
        return res;
    }
}