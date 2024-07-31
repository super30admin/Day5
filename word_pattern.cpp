// Time Complexity : O(N+M)
// Space Complexity : O(N+26) : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

class Solution {
public:
    vector<string> splitStringToWords(string& s) // O(N), N = length of string s
    {
        std::vector<string> words;

        // create string stream from s 
        std::istringstream stream(s);
        std::string word;
    
        // Extract words separated by whitespace
        while (stream >> word) {
            words.push_back(word);
        }

        return words;
    }

    bool wordPattern(string pattern, string s) {

        if(pattern.length() == 0)
        {
            return false;
        }

        std::vector<string> words = splitStringToWords(s); // O(N)

        if(pattern.length() != words.size())
        {
            return false;
        }

        std::unordered_map<char, string> char_word_map;
        std::unordered_map<string, char> word_char_map;

        for(int i = 0; i < pattern.length(); i++) // (O(M))
        {
            char c = pattern[i];
            string word = words[i];

            if(char_word_map.contains(c))
            {
                if(char_word_map[c] != word)
                {
                    return false;
                }
            }
            else
            {
                char_word_map[c] = word;
            }


            if(word_char_map.contains(word))
            {
                if(word_char_map[word] != c)
                {
                    return false;
                }
            }
            else
            {
                word_char_map[word] = c;
            }
        }

        return true;
    }
};