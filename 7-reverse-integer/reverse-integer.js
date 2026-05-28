/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {

    let negative = x < 0;

    x = Math.abs(x).toString();

    let reversed = [];

    for(let i = x.length - 1; i >= 0; i--){
        reversed.push(x[i]);
    }

    let ans = Number(reversed.join(""));

    if(ans > 2147483647){
        return 0;
    }

    return negative ? -ans : ans;
};