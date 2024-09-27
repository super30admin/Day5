// Time Complexity :O(n*k) , k is avarege length of words in the array 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no




class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
     Map<Double,ArrayList<String>> map =new HashMap<>();  
        
     double[] primeArray = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};    
       
     for(String s:strs){       
         
         double key = getKey(primeArray,s);      
         if(!map.containsKey(key)){
             map.put(key,new ArrayList<String>());
         }         
         map.get(key).add(s);
     }     
        
     return new ArrayList(map.values()); 
    }
    
    double getKey(double[] primeArray,String s){        
      double product=1;
       for(int i =0; i< s.length();i++){           
           int index = s.charAt(i)-'a';            
           product= product*primeArray[index];
       }
       return product;        
    }
   
}