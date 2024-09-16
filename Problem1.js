//Time Complexity: O(n) 
//Space Complexity: O(1)
//Runs: yes

//Approach 2
var isIsomorphic = function (s, t) {
    if (s.length !== t.length) return false;
    let sMap = new Map();
    let tMap = new Map();
    for (let i = 0; i < s.length; i++) {
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);
        if (sMap.has(sChar)) {
            if (sMap.get(sChar) !== tChar) return false;
        } else {
            sMap.set(sChar, tChar);
        }
    }

    for (let i = 0; i < t.length; i++) {
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);
        if (tMap.has(tChar)) {
            if (tMap.get(tChar) !== sChar) return false;
        } else {
            tMap.set(tChar, sChar);
        }
    }

    return true;
};


//Approach 1
var isIsomorphic = function (s, t) {
    if (s.length !== t.length) return false;
    let sMap = new Map();
    let set = new Set();
    for (let i = 0; i < s.length; i++) {
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);
        if (!sMap.has(sChar)) {
            if (set.has(tChar)) return false;
            sMap.set(sChar, tChar);
            set.add(tChar);
        } else {
            if (sMap.get(sChar) !== tChar) return false;
        }
    }
    return true;
};