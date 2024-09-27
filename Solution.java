
// Time : O(NK)
// Space : O(NK)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            
            HashMap<Character, Integer> tempDump = new HashMap<>();
            for(int i=0;i< s.length();i++){
                if(tempDump.get(s.charAt(i)) != null)
                    tempDump.put(s.charAt(i), tempDump.get(s.charAt(i))+1 );
                else
                     tempDump.put(s.charAt(i), 1 );
            }
            if(map.get(tempDump) != null ){
                List<String> tempList = new ArrayList<>(map.get(tempDump));
                tempList.add(s);
                map.put(tempDump, tempList);
            }
            else{
                map.put(tempDump, new ArrayList<>(){{add(s);}});
                }
        }
        
       
        return (new ArrayList<>(map.values()));
        
    }
}
