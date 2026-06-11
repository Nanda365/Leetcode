/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    for(let i = 0; i < nums.length; i++) {
        let req = target - nums[i];
        if(req in map) {
            return [map[req], i];
        }
        map[nums[i]] = i;
    }
};