public class Solution {
    // Time Complexity: O(n), where n is the number of characters in the pattern (and words in the string).
    // Space Complexity: O(n), where n is the number of characters in the pattern (and words in the string).
    
    public bool WordPattern(string pattern, string s) {
    
        string[] words = s.Split(' ');

        if (pattern.Length != words.Length) return false;

        Dictionary<char, string> charToWord = new Dictionary<char, string>();
        Dictionary<string, char> wordToChar = new Dictionary<string, char>();

        for (int i = 0; i < pattern.Length; i++)
        {
            char charPattern = pattern[i];  
            string word = words[i];         

            if (charToWord.ContainsKey(charPattern))
            {
                if (charToWord[charPattern] != word)
                {
                    return false; 
                }
            }
            else
            {
                charToWord[charPattern] = word;
            }

            if (wordToChar.ContainsKey(word))
            {
                if (wordToChar[word] != charPattern)
                {
                    return false;  
                }
            }
            else
            {
                wordToChar[word] = charPattern;
            }
        }

        return true;
    }
}
