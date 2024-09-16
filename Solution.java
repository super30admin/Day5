



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedanagrams= new ArrayList<>();
        HashMap<String,List<String>> mapped= new HashMap<>();
        
        for(String s : strs)
        {
            char[] ch= s.toCharArray();
          Arrays.sort(ch);
    String sorted= new String(ch);
        if(!mapped.containsKey(sorted))
        {
            mapped.put(sorted,new ArrayList<>());
        }
            mapped.get(sorted).add(s);
        }
         groupedanagrams.addAll(mapped.values());
        
        return groupedanagrams;
    
            
        }
        
    }