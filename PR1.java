//Difficulties faced: Check the looping, check variables, check initializations, check how you map through a hash set.//unit case.
//Time complexity-O(NKlogK)
//Space: O(N*k)
//Runs on leet code.
//Approach : Use a hashmap to map anagrams.Sort the strings using Arrays.sort().Use the sorted value as a key and store a list of the original strings in the hashmap. Finally, iterate through the hashmap to give the result.
class PR1 {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans= new ArrayList<List<String>>();
      if(strs.length<1) return ans;
      Map<String,List<String>> hmap=new HashMap<String,List<String>>();
      for(int i=0;i<strs.length;i++){
          StringBuilder sb=new StringBuilder();
          char[] arr=strs[i].toCharArray();
          Arrays.sort(arr);
          for(int j=0;j<arr.length;j++){
              sb.append(arr[j]);
          }
          String s=sb.toString();
          if(!hmap.containsKey(s)){
              List<String> l=new ArrayList<String>();
              l.add(strs[i]);
              hmap.put(s,l);
             
          }
          else{
               List<String> b=hmap.get(s);
               b.add(strs[i]);
               hmap.put(s,b);
          }
      }
          
          for(String b :hmap.keySet()){
             ans.add(hmap.get(b));
          }
         return ans;  
      }
       
    
}