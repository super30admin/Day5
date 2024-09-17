//Time Complexity :nk(where "n" length of the array and "k" is the length ofthe word)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes 
// Any problem you faced while coding this :No
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return new ArrayList<>();
        HashMap<Double, List<String>> aMap = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            // char[]cArr = strs[i].toCharArray();
            // Arrays.sort(cArr);
            // String sorted = String.valueOf(cArr);
            Double primeProduct = caluclateProduct(strs[i]);
            if(!aMap.containsKey(primeProduct)){
                aMap.put(primeProduct, new ArrayList<>());
            }
            aMap.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(aMap.values());
    }
    public double caluclateProduct(String s){
        int [] nums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            result = result*nums[c - 'a'];
        }
        return result;
    }
    
}
//Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes 
// Any problem you faced while coding this :No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!smap.containsKey(schar)){
                smap.put(schar,tchar);
            }else{
                 if(smap.get(schar) != tchar) return false;
            }
             if(!tmap.containsKey(tchar)){
                 tmap.put(tchar, schar);
             }else{
                 if(tmap.get(tchar) != schar) return false;
             }
                 
        }
        return true;
    }
}

