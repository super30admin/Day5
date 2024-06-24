// Before Class Solution

// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// String array hash for storing the hash of the chars used in pattern
// HashSet of string for storing unique values of the trimmed string till  " " 
// Run the loop till pattern.length()
// Generate the correct index of hash char ny subtracting 97 since the ascii values for small 'a' starts from 97
// with the while loop trim the string till " " space
// if the hashIndex value is not present in sash just add the value to hash and HashSet 
// else compare the values of the trimmed string and the hash value for the hashIndex, If there is match move forward of not returh false 
//Finally check if we reached till the end of the String s if not return false of elsedefault  return true 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] hash = new String[26];
        HashSet<String> hashSet = new HashSet<>();
        int lastIndex = 0;
        for(int i=0; i<pattern.length();i++){
            int hashIndex = (int)pattern.charAt(i) - 97;
            String value = "";
            while(lastIndex < s.length() && s.charAt(lastIndex)!= ' '){
                value = value + s.charAt(lastIndex);
                lastIndex = lastIndex + 1; 
            }
            lastIndex++;
            if(hash[hashIndex]!=null){
                String hashValue = hash[hashIndex];
                if(!hashValue.equals(value)){
                    return false;
                }
            }else{
                if(hashSet.contains(value)){
                    return false;
                }
                hash[hashIndex] = value;
                hashSet.add(value);
            }
        }
        if(lastIndex - 1 != s.length()) {
            System.out.println("returning from lastIndex check"+ lastIndex);
            return false;
        }
        return true;
    }
}