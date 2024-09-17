//Time complexity is O(m*n*logn) where m is length of given array, n is maximum length of string in given array.
//Space complexity is O(m*n)
//Able to submit the code in leetcode
class Solution {
    HashMap<String, List<String>> hm = new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String temp = new String(charArr);
            List<String> li = hm.getOrDefault(temp, new ArrayList());
            li.add(str);
            hm.put(temp, li);
        }
        for(String str: hm.keySet()){
            result.add(hm.get(str));
        }
        return result;
    }
}
