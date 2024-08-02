// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         for(int i=0;i<nums.length;i++){
//             int right=i+1;
//             if(target<nums[i]){
//                 continue;
//             }
//             if(target>nums[i] && nums.length-1==right){
//                 // right=i+1;
//                 if(nums[i]+nums[right]==target){
//                     return new int[]{i,right};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it does, return the indices of the complement and the current element
                return new int[]{map.get(complement), i};
            }
            
            // If the complement doesn't exist, add the current element and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array (though the problem states there will always be one solution)
        return new int[]{};
    }
}
