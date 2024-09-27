class Solution {
    public List<List<String>> anagrams(String[] strs) {
        // System.out.println(strs)
        HashMap <String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedstr = String.valueOf(c);
            // System.out.println(sortedstr);

            if(!map.containsKey(sortedstr)){

                map.put(sortedstr, new ArrayList<String>());
            }

            map.get(sortedstr).add(strs[i]);

        }
          return new ArrayList <List<String>>(map.values());
    }
}