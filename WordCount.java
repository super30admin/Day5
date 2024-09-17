// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length())    return false;
        HashMap<String, String> mapping = new HashMap<>();
        HashSet<String> assigned = new HashSet<>();
        String a;
        for(int i = 0; i < strArr.length; i++){
            a = Character.toString(pattern.charAt(i));
            if(mapping.containsKey(a)) {
                if (!mapping.get(a).equals(strArr[i])) return false;
            } else{
                if(assigned.contains(strArr[i]))    return false;
                assigned.add(strArr[i]);
                mapping.put(a, strArr[i]);
            }
        }
        return true;

    }
}