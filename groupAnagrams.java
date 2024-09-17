//Run time : O(linear in terms of string length) ,same for space


// for every string , check equivalent string where occurence is same via count
//add to hashmap and return anagram for each similar string
public List<List<String>> groupAnagrams(String[] strs) {
    if(strs == null || strs.length==0) return new ArrayList();
    HashMap<String,List<String>> hash = new HashMap<>();
    for(String s:strs){
        char[] check = new char[26];
        for(char myString : s.toCharArray()) check[myString - 'a']++;
        String getVal = String.valueOf(check);
        if(!hash.containsKey(getVal)){
            hash.put(getVal,new ArrayList());
        }
        hash.get(getVal).add(s);

    }
   return new ArrayList<>(hash.values());
    }
}

