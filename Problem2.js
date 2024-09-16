//Time Complexity: O(n) 
//Space Complexity: O(1)
//Runs: yes

var wordPattern = function (pattern, s) {
    const sArr = s.split(" ");
    if (sArr.length !== pattern.length) return false;
    let pMap = new Map();
    let sMap = new Map();
    for (let i = 0; i < pattern.length; i++) {
        let pChar = pattern.charAt(i);
        let sWord = sArr[i];
        if (pMap.has(pChar)) {
            if (pMap.get(pChar) !== sWord) return false;
        } else {
            pMap.set(pChar, sWord);
        }
    }

    for (let i = 0; i < sArr.length; i++) {
        let pChar = pattern.charAt(i);
        let sWord = sArr[i];
        if (sMap.has(sWord)) {
            if (sMap.get(sWord) !== pChar) return false;
        } else {
            sMap.set(sWord, pChar);
        }
    }
    return true;
};