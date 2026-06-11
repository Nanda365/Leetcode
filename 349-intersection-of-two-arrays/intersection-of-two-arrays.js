/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
arr1 = [...new Set(nums1)]
arr2 = [...new Set(nums2)]

let result = [];

for(let i=0;i<arr1.length;i++){
    for(let j=0;j<arr2.length;j++){
        if(arr1[i]===arr2[j]){
            result.push(arr1[i]);
        }
    }
}
return result;
    
};