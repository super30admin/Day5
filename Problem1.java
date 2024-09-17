//Step 1 - Convert each string value to character array and sort it.
//Step2 All anagrams are equal once sorted character wise.
//Step 3 Add to map ,if there is already present then add that string to arraylist.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        Map<String, List> ans= new HashMap<String,List>();
        for(String s: strs)
        {
            char[] ch =s.toCharArray();
            Arrays.sort(ch);
            String st= String.valueOf(ch);
            if(!ans.containsKey(st)) ans.put(st,new ArrayList());
            ans.get(st).add(s);
        }
        return new ArrayList(ans.values());
        
    }
}