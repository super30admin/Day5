public class sample {
}
//Problem:1
// Time Complexity : O(nlogn)
// Space Complexity :O(N^2) 2d list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
/* I was not struck with the intial idea of sorting the characters of the each word of the String
I had refereed from some sources.*/

// Your code here along with comments explaining your approach
/* Here the basic approach would be finding the sorted order of each String given
and check if they are matching. If they are  same they are anagram of eachother so
 we store them in a list. Likewise we will do for all the unique sorted strings.
 In the end we will add all lists to 2-d list and return*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> defaultMap= new HashMap<>();//Hashmap declaration with key as string and value as the arraylist
        List<List<String>> anagramHolder = new ArrayList<>();//2d arrayList for storing the result
        for(String s: strs){
            char [] Characters= s.toCharArray();
            Arrays.sort(Characters); //Sorting the characters of each string
            String sorted = new String(Characters);
            if(!defaultMap.containsKey(sorted)){
                defaultMap.put(sorted,new ArrayList<>());//storing to hashmap with key as the sorted string and value will be ArrayList
            }
            defaultMap.get(sorted).add(s);//we will add all the strings with same sorted strings to one array.
        }
        anagramHolder.addAll(defaultMap.values());//saving all lists to 2d list

        return anagramHolder;
    }
}

//Problem:2
// Time Complexity : O(n)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/* Here the basic approach would be mapping the unique character
 of string s with string t. If character is already mapped we won't map again.
  We will build the string with the mapped values from s.
   If the built string is same as t then it is isomorphic else false*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> defaultMap=new HashMap<>();
        StringBuilder sb= new StringBuilder();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){//Mapping the character of s with t. key repetition is not allowed and the value repetition is not allowed.
                if(!defaultMap.containsKey(s.charAt(i))&&!defaultMap.containsValue(t.charAt(i))){
                    defaultMap.put(s.charAt(i),t.charAt(i));
                }
            }
            for(int i=0;i<s.length();i++){
                sb.append(defaultMap.get(s.charAt(i)));//we will build string for the s using the mapped values
            }
            if(sb.toString().equals(t)) return true;//if built string and the t are equal then they are isomorphic.
            else return false;
        }

        else return false;

    }
}
//Problem:3
// Time Complexity : O(n)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/* Here we are basically using the same of approach of second problem.
we map the characters with string array. If key is already mapped then we won't map again.
If  any value is already mapped to specific key then we won't map that value again.
For every value of character in pattern we get the mapped value and
check if its equal to string at that specific index, if so we will increase a counter.
In the end if counter is equal to length the its following wordPattern*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int count =0;
        String[] splitted=s.split(" ");//splitting the  string into String array
        if(pattern.length()== splitted.length) {
            HashMap<Character, String> defaultMap = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {//Mapping with the chaarcter in pattern with the  string in array
                if (!defaultMap.containsKey(pattern.charAt(i)) && !defaultMap.containsValue(splitted[i])) {
                    defaultMap.put(pattern.charAt(i), splitted[i]);
                }
            }
            for (int i = 0; i < pattern.length(); i++) {//checking for the pattern if mapped value at specific caharcter is equal to the string in array
                if (defaultMap.containsKey(pattern.charAt(i)) &&defaultMap.get(pattern.charAt(i)).equals(splitted[i])) {
                    count++;//if equal incrementing counter
                }
            }
            if (count == pattern.length()) return true;
            else return false;//we will return
        }
        else return false;

    }
}