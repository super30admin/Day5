

//Grouping anagrams
Time Complexity O(nklogk) + Lookup Time in HashMap- O(k)
Space complexity O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groupmap = new HashMap<>();
        for (int i=0;i<strs.length;i++) {
            char[] carray = strs[i].toCharArray();
            Arrays.sort(carray);
            String sortedStr = String.valueOf(carray);
            if (!groupmap.containsKey(sortedStr)) {
                groupmap.put(sortedStr, new ArrayList<String>());
                groupmap.get(sortedStr).add(strs[i]);
            } else {
                groupmap.get(sortedStr).add(strs[i]);
            }
        }
        return new ArrayList<>(groupmap.values());
        
    }
}


//Isomorphic strings

// Time complexity:O(n)
// Space complexity:Constant time 
class Solution {
    public boolean isIsomorphic(String s, String t) {
    
    if (s.length() != t.length()) {
        return false;
    }
    Map<String, Character> mapst = new HashMap<String, Character>();

    for (int i=0;i<s.length();i++) {
        String sc = "s" + "_" + s.charAt(i);
        if (!mapst.containsKey(sc)){
            mapst.put(sc , t.charAt(i)) ;
        } else {
            if (mapst.get(sc) != t.charAt(i)) {
                return false;
            }
        }
        sc = "t" + "_" +t.charAt(i);
        if (!mapst.containsKey(sc)) {
            mapst.put(sc , s.charAt(i)) ;
        } else {
            if (mapst.get(sc)!= s.charAt(i)) {
                return false;
            }
        }
    }
    return true;


    }
}
