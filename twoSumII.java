// brute force solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(target == numbers[i]+numbers[j]){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};
    }
}

// sub-optimal solution using hash map
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)){
                return new int[] {(map.get(complement))+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}

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