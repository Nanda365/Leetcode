/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    x= x.toString();
    let reversed = [];
    for(let i=x.length-1;i>=0;i--){
        reversed.push(x[i]); 
    }
    reversed = reversed.join("");
    return reversed===x;
};