/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    for(let i = 0; i < nums.length; i++) {
        let newtarget = target - nums[i];
        if(map[newtarget] !== undefined) {
            return [map[newtarget], i];
        }
        map[nums[i]] = i;
    }
};