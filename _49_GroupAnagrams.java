
// space complexity - o(1)
    	//time - o(log(n))
      //Ran on leeetcode successfully : Yes
      // Problem faced  : No
    	//Approach : all anagram will produce same hash, use hash as key

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String hash = hashVal(str);
            System.out.println(hash);
            List<String> val = map.getOrDefault(hash, new ArrayList<>());
            val.add(str);
            map.put(hash, val);
        }

        return map.values().stream().collect(Collectors.toList());

    }

    public String hashVal(String str){

        String res = "";

        int[] arr = new int[26];
        for(int i = 0 ; i< str.length(); i++){
            arr[str.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ; i< 26 ; i++){
            if(arr[i] != 0){
                res = res + arr[i] + (char)('a' + i);
            }
        }
        return res;

    }
}

//_49_GroupAnagrams
