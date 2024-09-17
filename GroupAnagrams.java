class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupana=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            String word=strs[i];
            char[] letters=word.toCharArray();
            Arrays.sort(letters);
            String newword=new String(letters);
            if(map.containsKey(newword))
            {
                map.get(newword).add(word);
            }
            else
            {
                List<String> words=new ArrayList<>();
                words.add(word);
                map.put(newword,words);
            }
        }
        for(String s: map.keySet())
        {
            groupana.add(map.get(s));
        }
        return groupana;
    }
}