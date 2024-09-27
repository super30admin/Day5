/*

Time complexity - O(NK) - where N is the length of the string array and K is the average length of each string in the array
Space complexity - O(N) as every string in the input string array gets stored in the hash map once.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
        {
            return new ArrayList();
        }
            
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int[] count = new int[26]; // As the string only contains lower case letters.
            for(int k=0;k<str.length();k++)
            {
                Character c=str.charAt(k);
                count[c-'a']++;
            }
            StringBuilder strbuild=new StringBuilder(""); // to build the length of each character in a string in the sorted array along with count e.g : (a1b2c3)
            for(int j=0;j<26;j++)
            {
                if(count[j]>0)
                {
                    strbuild.append('a'+j);
                    strbuild.append(count[j]);
                }
            }
            String res=strbuild.toString();
            //System.out.println(res);
            if(!map.containsKey(res))
            {
                map.put(res,new ArrayList());
            }
            map.get(res).add(str);
        }
        
        return new ArrayList(map.values()); // All the values in the map will have the results.
    }
}
