//Time: O(nk), Space: O(nk)
//Ran Successfully on leetCode - solution accepted
var groupAnagrams = function(strs) {
    let hash_map ={};
    for(let i=0; i<strs.length; i++){
        let product = prime_product(strs[i])
        if(!(product in hash_map)){
            hash_map[product] = [];
        }
        hash_map[product].push(strs[i])
    }
    let result =[]
    Object.keys(hash_map).map(el => result.push(hash_map[el]));
    return result;
};


function prime_product(s){
    let prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    let result = 1;
    for(let i = 0;i< s.length; i++){
        let idx = s[i].charCodeAt(0) - 'a'.charCodeAt(0);
        result *= prime_numbers[idx]
    }
    return result;
}