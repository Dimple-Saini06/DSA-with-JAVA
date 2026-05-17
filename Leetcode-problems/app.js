var canBeIncreasing = function(nums) {
    let count = 0;
    for(let i=1;i<nums.length;i++){
        if(!(nums[i-1] < nums[i])){
            count++;
            if(count>1){return false;}
            if (i > 1 && nums[i - 2] >= nums[i]) {
                nums[i] = nums[i - 1];
            }
        }
    }
    return true;
};

let nums1 = [1,2,10,5,7];
let nums2 = [2,3,1,2];
let nums3 = [1,1,1];
let nums4 = [1,1];

console.log(canBeIncreasing(nums1));
console.log(canBeIncreasing(nums2));
console.log(canBeIncreasing(nums3));
console.log(canBeIncreasing(nums4));