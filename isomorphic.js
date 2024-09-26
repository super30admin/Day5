// Time Complexity : O(N) length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

//Use two hashmaps to hold the key value pairs
// compare if key already exists, else append
//check if the key value are the same in both hashmaps, return true. 


/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    if(s.length != t.length){
        return false
    }
    let sMap = new Map(); 
    let tMap = new Map();
    for(let i = 0; i < s.length; i++){
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);
        if(sMap.has(sChar)){
            if(sMap.get(sChar) != tChar) return false;
        }
        else {
            sMap.set(sChar, tChar)
        }
        
         if(tMap.has(tChar)){
            if(tMap.get(tChar) != sChar) return false;
        }
        else {
            tMap.set(tChar, sChar)
        }
    }
    return true;
    
};