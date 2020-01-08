class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        std::vector<vector<int>> result;
        if(nums.empty()){
            return result;
        }
        std::size_t n_size = nums.size();
        std::sort(nums.begin(),nums.end());
        for(int i=0;i<n_size;i++){
            //when iteration goes beyond the int array length
            if(nums[i]>0)break;
            //when the letters match
            if(i > 0 and nums[i]==nums[i-1])continue;
            //setting up the left and right boundary for searching and matching
            int left = i + 1,right = n_size - 1;
            // then because the string has been pre-sorted
            // the numbers are in increasing order
            // when the sum is less than 0 go to the next digit
            // which will generate a larger sum
            // 
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                  ++left;
                }
                else if(sum > 0){
                  --right;
                }
                else{
                    // when the sum matches the problem's requirement
                    result.push_back({nums[i],nums[left],nums[right]});
                    // there could be repetitive number,the following code eliminates this situation
                    int last_left = nums[left],last_right = nums[right];
                    while(left<right&&nums[left]==last_left)++left;
                    while(left<right&&nums[right]==last_right)--right;
                    
                }
            }
            
        }
        return result; 
    } 
};
