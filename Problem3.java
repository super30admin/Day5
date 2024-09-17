//Time- O(n)- n is the letters in the string s
//Space- O(n)+o(k)- k is size of pattern string
//Passed in leetcode-yes
//Issue faced- no

class Solution { // input is pattern-abb, string- dog cat cat
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");//o(n)
        if (words.length != pattern.length())
            return false;
        if( pattern==null || s==null)
        {
            return true;
        }
        if(pattern.length()==0 && words.length==0)
        {
            return true;
        }
       HashMap<String,Character> hm = new HashMap<>(); 
       HashSet<Character> set = new HashSet<>();
       int index=0;
       for(String str: words) //traverse the stringo(n-n is works in string)
       {
           if(!hm.containsKey(str)) //if word not in map//o(1)
           {
               if(!set.contains(pattern.charAt(index)))//o(1)
               {
                hm.put(str,pattern.charAt(index));//map the word to the pattern index    
                set.add(pattern.charAt(index));
                index++;   
               }            
                      
            else
                       return false;
                       
           }
           else
           {
               if(hm.get(str)==pattern.charAt(index))//if the key already mapped to a letter, we check if equal to
                    index++;
               else
                    return false;
                   
           }
       }
    return true;
    }
}