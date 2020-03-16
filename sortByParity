/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/

class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& A) {
        std::partition(
            std::begin(A),
            std::end(A),
            [](auto e){
                return e%2==0;
            }); 
        return A;
    }
}
