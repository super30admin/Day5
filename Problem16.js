// time complexity: O(n)
// space complexity: O(n)
/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let pat = pattern.split("");
    let str = s.split(" ");
    let pMap = new Map();
    let sMap = new Map();
    
    if(pat.length !== str.length) return false;
    for(let i=0; i<pat.length; i++){
        if(pMap.has(pat[i])){
            if(pMap.get(pat[i]) !== str[i]){
                return false
            }
        } else {
            pMap.set(pat[i], str[i]);
        }
        
        if(sMap.has(str[i])){
            if(sMap.get(str[i]) !== pat[i]){
                return false
            }
        } else {
            sMap.set(str[i], pat[i]);
        }
        
    }
    return true;
};