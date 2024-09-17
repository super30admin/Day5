import java.util.HashMap;

//Time Complexity : O(n)
//Space Complexity : O(n) Storing the characters into the Hashmap
// Not sure if its on leetcode
// Problems :  No problem


/*
Here we will be having mapping of pattern characters and their corrosponding input
If the pattern values occur again, we'll make sure that it's corrospoding value is same as before
If it's not the same, we'll be returning false
 */


public class Hashing_1_Problem_3 {

    public static boolean patternCheck(String pattern,String input)
    {
        HashMap<String,String> checker = new HashMap<>();
        String[] inputArr = input.split(" ");
        for(int i=0;i<pattern.length();i++)
        {
            if(checker.containsKey(pattern.charAt(i)+""))
            {
                if(checker.get(pattern.charAt(i)+"").equals(inputArr[i]))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                checker.put(pattern.charAt(i)+"",inputArr[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String input = "dog cat cat dog";
        System.out.println(patternCheck(pattern,input));
        pattern = "abba";
        input = "dog cat cat fish";
        System.out.println(patternCheck(pattern,input));
        pattern = "aaaa";
        input = "dog cat cat dog";
        System.out.println(patternCheck(pattern,input));
        pattern = "abba";
        input = "dog dog dog dog";
        System.out.println(patternCheck(pattern,input));
    }
}
