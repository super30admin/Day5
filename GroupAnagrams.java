//Time Complexity : O(NK) - N is the length of strings, K - constant (26)
//Space Complexity : O(NK) - N is the length of string plus the '#'s. K - constant (26)
//Did it run sucessfully on LeetCode?: YES
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        if ( strs == null || strs.length == 0) 
            return result;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        int[] charCountArr;
        StringBuilder sb;
        for ( String str : strs)
        {     
            charCountArr = new int[26];
            
            for ( int i = 0; i < str.length(); i++)
            {               
                charCountArr[str.charAt(i) - 'a']++;
            }
            sb = new StringBuilder();
            for ( int i = 0; i < 26; i++)
            {
                sb.append(charCountArr[i]).append('#');
            }
            String s = sb.toString();
            if  (!map.containsKey(s))        
            {
                map.put(s, new ArrayList());
            }
            map.get(s).add(str);
            
        }
        return new ArrayList(map.values());
        
    }
}
