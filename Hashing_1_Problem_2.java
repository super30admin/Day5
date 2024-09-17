import java.util.HashSet;
//Time Complexity : O(n) (n + n)
//Space Complexity : O(n) Storing the characters into the hashset
// Not sure if its on leetcode
// Problems :  No problem

/*
If two strings has equal number of non repeating characters, they can be classified as isomorphic strings.
 */


public class Hashing_1_Problem_2 {
    public static boolean isomorphic(String s1,String s2)
    {
        if(nonRepeatingCharacters(s1) == nonRepeatingCharacters(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        String s3 = "foo";
        String s4 = "bar";
        String s5 = "paper";
        String s6 = "title";
        System.out.println(isomorphic(s1,s2));
        System.out.println(isomorphic(s3,s4));
        System.out.println(isomorphic(s5,s6));
    }
    public static int nonRepeatingCharacters(String s)
    {
        HashSet<Character> characterSet = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            characterSet.add(s.charAt(i));
        }
        return characterSet.size();
    }
}
