//time complexity: O(n)
//space complexity: O(1)
//Solved On leetcode successfully: Not applicable. Not sure if this question is available on leetcode.
public class CheckStringPattern {

    public static void main(String[] args) {
        boolean result1 = checkIfStringFollowsPattern("abba","dog cat cat dog");
        System.out.println(result1);

        boolean result2 = checkIfStringFollowsPattern("abba","dog cat cat fish");
        System.out.println(result2);

        boolean result3 = checkIfStringFollowsPattern("aaaa","dog cat cat dog");
        System.out.println(result3);

        boolean result4 = checkIfStringFollowsPattern("abba","dog dog dog dog");
        System.out.println(result4);
    }

    public static boolean checkIfStringFollowsPattern (String inputStringWithChars, String inputStringWithPattern) {
        HashMap <Character,String> mapForCharacters = new HashMap<>();
        HashMap <String, Character> mapForStrings = new HashMap<> ();

        char [] patternCharArray = inputStringWithChars.toCharArray();
        String [] patternStringArray = inputStringWithPattern.split(" ");

        if (patternCharArray.length != patternStringArray.length) {
            return false;
        }

        //for loop for input first input string
        for (int i =0; i<patternCharArray.length;i++) {
            if (!mapForCharacters.containsKey(patternCharArray[i])){
                mapForCharacters.put(patternCharArray[i],patternStringArray[i]);
            }

            else {
                if (!mapForCharacters.get(patternCharArray[i]).equals(patternStringArray[i]))
                    return false;
            }
        }

        //for loop for second input string
        for (int i =0; i<patternStringArray.length;i++) {
            if (!mapForStrings.containsKey(patternStringArray[i])){
                mapForStrings.put(patternStringArray[i],patternCharArray[i]);
            }

            else {
                if (!mapForStrings.get(patternStringArray[i]).equals(patternCharArray[i]))
                    return false;
            }
        }


        return true;
    }
}
