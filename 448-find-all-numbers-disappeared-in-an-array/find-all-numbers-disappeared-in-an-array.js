/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let sorted = nums.sort((a,b)=>(a-b));
    let unique = new Set(nums);
    let result = [];
    for(let i=1;i<=nums.length;i++){
        if(!unique.has(i)){
            result.push(i)
        }
    }
    return result;
};