// Time Complexity : O(n) linear
// Space Complexity : O(1) fixed space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

// ~1ms runtime on submission
public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length()) return false;
        
        char[] smap = new char[256], tmap = new char[256], schar = s.toCharArray(), tchar = t.toCharArray();
        
        for(int idx = 0; idx < schar.length; idx++){
             if(smap[schar[idx]] == 0 && tmap[tchar[idx]] ==0){
                 smap[schar[idx]] = tchar[idx];
                 tmap[tchar[idx]] = schar[idx];
             }else if(smap[schar[idx]] != tchar[idx] || tmap[tchar[idx]] != schar[idx]){
                 return false;
             }
        }
        
        return true;
}


// OR

// ~7ms runtime on submission
public boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> map = new HashMap();
        Set<Character> visited = new HashSet();
        
        for(int i =0; i<s.length();i++){
            Character p = s.charAt(i),  q = t.charAt(i);
            if(!map.containsKey(p)){ 
                if(visited.contains(q)) return false;
                map.put(p, q); 
                visited.add(q);
            }else if(!map.get(p).equals(q)) return false;
        }
        return true;
}
