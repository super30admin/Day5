/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    var sArray = s.split(' ');
    var sl = sArray.length;
    var pl = pattern.length;
    if(sl != pl) {
        console.log(`sl ${sl}, pl ${pl}`);
        return false;
    }
    var map = {};
    var sMap = {};
    for(let i =0; i< pl; i++){
        
        if( map.hasOwnProperty(pattern[i])){
            if(map[pattern[i]] != sArray[i]) return false;
        }else map[pattern[i]] = sArray[i];
        if( sMap.hasOwnProperty(sArray[i])){
            if(sMap[sArray[i]] != pattern[i]) return false;
        }else sMap[sArray[i]] = pattern[i];
    }
    return true;
};