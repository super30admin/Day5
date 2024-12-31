/**
 * Time Complexity - O(n^2)
 * Space complexity - O(1)
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
   var pat = new Map();
    var str = new Map();
    pattern = pattern.split('');
    s = s.split(' ');
    if(pattern.length!==s.length){
        return false;
    }
    for(let i=0;i<pattern.length;i++){
        pat.set(pattern[i],i);
    }
    for(let j=0;j<s.length;j++){
        str.set(s[j],j);
    }
    for(let k=0;k<s.length;k++){
        if(pat.get(pattern[k])!==str.get(s[k])){
            return false;
        }
    }
    return true; 
};