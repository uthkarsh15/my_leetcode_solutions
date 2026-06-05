// optimal solution using two pointer approach
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(target == numbers[i] + numbers[j]){
                return new int[] {i+1,j+1};
            }
            else if(target > numbers[i] + numbers[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[] {i,j};
    }
}