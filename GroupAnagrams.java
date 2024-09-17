/*Time complexity:

O(n* (klogk) + k)
//n string , klogk for srt opertation,
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        if (strs.length == 0 || strs== null ) { return new ArrayList<>();}

        for (String str : strs)
        {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);
            if (!stringAnagramsMap.containsKey(key))
            {
                stringAnagramsMap.put(key, new ArrayList<>());

            }

            stringAnagramsMap.get(key).add(str);



        }
        List<List<String>> resultList = new ArrayList<>();
        for(Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet())
        {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }
}