//Time Complexity: Approach-1 O(nklog(k)) Approach-2 O(nk) where n is array size k is each word size
//Space Complexity: O(1)
//Runs: yes


//Approach 1
var groupAnagrams = function (strs) {
    if (!strs || strs.length === 0) return
    let result = new Map();

    for (let i of strs) {
        let s = sortedWord(i);
        let l = result.get(s) || [];
        l.push(i);
        result.set(s, l);
    }
    // console.log(result.values());
    return Array.from(result.values());


};

var sortedWord = function (str) {
    return str.split("").sort().join("");

}


//Approach 2
var groupAnagrams = function (strs) {
    if (!strs || strs.length === 0) return
    let result = new Map();

    for (let i of strs) {
        let primeProd = primeProduct(i);
        let l = result.get(primeProd) || [];
        l.push(i);
        result.set(primeProd, l);
    }
    // console.log(result.values());
    return Array.from(result.values());


};

var primeProduct = function (str) {
    let result = 1;
    const primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103];
    for (let i = 0; i < str.length; i++) {
        let char = str.charCodeAt(i);
        result = result * primes[char - 96];
    }
    return result;
}





