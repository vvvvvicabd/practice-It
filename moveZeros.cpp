/*
Given an array nums, write a function to move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.
*/
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        std::stable_partition(
            std::begin(nums),
            std::end(nums),
            [](auto e){
                return e!=0;
            }
        );
    }
};
