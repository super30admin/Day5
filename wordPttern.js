//   Time Complexity : O(N)
//   Space Complexity : O(M) where M is unique characters
//   Did this code successfully run on Leetcode :Yes
//   Any problem you faced while coding this : No

//  use two sets, one for the word to letter and other for the letter to word.
//  store the corresponding word to the letter in the wordLetter
//  check if already exists and other way round, return true or false

const wordPattern = (pattern, str) => {
    
    const words = str.trim().split(' ');
    const len = words.length;
    if (len !== pattern.length) return false;
    
    //two sets
    const letterWord = {}, wordLetter = {};

    for (let i = 0; i < len; i++){

        if (letterWord[pattern[i]] !== undefined && letterWord[pattern[i]] !== words[i])
            return false;

        if (wordLetter[words[i]] !== undefined && wordLetter[words[i]] !== pattern[i])
            return false;

        letterWord[pattern[i]] = words[i];
        wordLetter[words[i]] = pattern[i];

    }

    return true;
};
