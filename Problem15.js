// time complexity: O(n)
// space complexity: O(n)
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let sl = s.length;
    let tl = t.length;
    let sMap = new Map();
    let tMap = new Map();
    for(let i=0; i< sl; i++){
        let sChar = s.charAt(i);
        let tChar = t.charAt(i);
        if(sMap.has(sChar)){
            if(sMap.get(sChar) !== tChar){
                return false;
            }
        } else {
            sMap.set(sChar, tChar);
        }
        
        if(tMap.has(tChar)){
            if(tMap.get(tChar) !== sChar){
                return false;
            }
        } else {
            tMap.set(tChar, sChar);
        }
        
    }
    
    
    return true;
    
}; 