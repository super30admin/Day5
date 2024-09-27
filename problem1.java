
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        /**
         * Time complexity - O(nk) where n is length of input array and k is length of each element
         * Space complexity - O(n)
         * Algorithm:
         * 1. Create an integer array of 26(number of alphabets) length
         * 2. Iterate over the input array
         * 3. Fill in alphabets array by adding number of occurences of that alphabet
         * 4. Append the numbers in the alphabet array in a StringBuilder
         * 5. check if the map contains the string of numbers appende
         * 6. If yes add the input element to the list corresponding to appended numbers
         * 7. If not then add the key value pair into the map
         **/
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        if(strs==null||strs.length==0)
            return result;

        int[] alpha = new int[26];

        for(int i=0; i<strs.length; i++)
        {
            Arrays.fill(alpha,0);
            char[] ch = strs[i].toCharArray();

            for(char c : ch)
                alpha[c-'a']++;

            StringBuilder sb = new StringBuilder();

            for(int j=0; j<alpha.length; j++)
            {
                sb.append('#');
                sb.append(alpha[j]);
            }

            String input = sb.toString();

            if(!map.containsKey(input))
            {
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(input,ls);
            }

            else
            {
                map.get(input).add(strs[i]);
            }
        }


        return new ArrayList(map.values());
    }
}