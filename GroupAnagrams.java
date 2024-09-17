/**
 * Time Complexity - O(nk) - n number of strings and k max length of string
 * Space Complexity - O(nk) - n number of strings  and k max length of string
 * Yes this code ran on leetcode
 * Critical point was how efficient to create unique key.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Long,List<String>> map = new HashMap<>();

        for(String str :  strs){
            Long code = getCode(str);

            if(!map.containsKey(code)){
                map.put(code, new ArrayList<>());
            }
            map.get(code).add(str);
        }
        List<List<String>> res = new ArrayList<>();

        for(List<String> list : map.values()){
            res.add(list);
        }
        return res;
    }

    public Long getCode(String str){
        Long sum = 0L, product = 1L;
        for(char ch:str.toCharArray()){
            sum += ch;
            product *= ch;
        }
        return product * sum;
    }
}