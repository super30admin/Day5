//group anagrams
//Time Complexity o(nklog(k)), as for each string, sorting takes o(klogk), where k is max len of a string. There are n strings in a array.
//space complexity is o(nk)

// I will be taking each string in the array and conver it into char array everytime. For that char array, I will sort and check whether
// the hashmap contains that string. Based on that, new list is instantiated or added to the list, string is added to the hashmap with key 
//as sorted array and values are the strings that matched to the key.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0; i<strs.length; i++)
        {
            String temp = strs[i];
            char[] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!hm.containsKey(key))
                hm.put(key,new ArrayList<>());
            hm.get(key).add(temp);
        }
        return new ArrayList<>(hm.values());
    }
}

//Isomorphic strings
//Time complexity o(n) n is the length of the string
//Space complexity o(n)
//as lengths are same, I will iterate over two strings, each time I will take the characters and check whether the hashmap have those
// in either key or value already. If not I will store those characters, If the condition is false, I will check the if it present as key,
// if not I will return false. 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t == null)
            return true;
        if(s==null || t == null)
            return false;
        HashMap<Character,Character> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!hm.containsKey(schar) && !hm.containsValue(tchar))
            {
                hm.put(schar,tchar);
            }
            else if(hm.containsKey(schar)){
                char ch = hm.get(schar);
                if(ch!=tchar)
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}

// Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there 
//is a bijection between a letter in pattern and a non-empty word in str
//Time complexity o(n)
//space complexity o(nk) k is the length of each string, n is the total words

// I will split the string into words arrays
//I will compare the lengths and return the false if not equal.
// I will itearate and check whether the hashmap contains the character and word as a key and value.
//If not, I will add them into hashmap
//If yes, I will check whether if the character is present as key and if yes, i will compare those values and continue.
// else I will return false.
class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null && str == null)
            return true;
        if(pattern == null || str == null)
            return false;
        String[] words= str.split("\\s+");
        if(words.length != pattern.length())
            return false;
        HashMap<Character, String> hm = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch =pattern.charAt(i);
            if(!hm.containsKey(ch) && !hm.containsValue(words[i]))
                hm.put(ch,words[i]);
            else if(hm.containsKey(ch) && hm.get(ch).equals(words[i])){
                    continue;
            }
            else
                return false;
        }
        return true;
    }
}