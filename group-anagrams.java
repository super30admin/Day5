TC: O(nklogk)
SC: o(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<List<String>> al = new ArrayList<List<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        
        for(int i=0;i<strs.length;i++) {
            ArrayList<String> list = new ArrayList<>();
            if(hm.containsKey(sort(strs[i]))) {
              list = hm.get(sort(strs[i]));
                // System.out.println( strs[i] + " exists " +  hm.get(sort(strs[i])));
              list.add(strs[i]);
              hm.put(sort(strs[i]), list);
            } else {
                list.add(strs[i]);
                hm.put(sort(strs[i]), list); 
            }       
        }
       
        for(ArrayList<String> values: hm.values()) {
            System.out.println(values);
            al.add(values);
        }

        return al;
            
    }
    
    public String sort(String val) {
        // System.out.println(val + " in sort string");
         char[] arr = val.toCharArray();
         Arrays.sort(arr);
         String strVal = new String(arr);
         // System.out.println(strVal);
         return strVal;
    }
}
