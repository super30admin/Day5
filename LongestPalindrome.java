import java.util.HashSet;
import java.util.Set;

//Longest Palindrome



//Time Complexity - o(n)
//Space Complexity - 0(n) - 0(1) - because characters are constant to 26 or even 52 considering both small and capital letters
//Approach
// traverse through string to add character i na hashset. if the char already exists increment the coutn by 2 and remove the character.
//if not add the character.
//if the hashset is empty return the count or else return count +1;




public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length()==0 || s.equals(null)) return -1;
        Set<Character> set = new HashSet<>();
        int count =0;

        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                count = count+2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.isEmpty()){
            return count;
        }else {
            return count+1;
        }

    }
}
