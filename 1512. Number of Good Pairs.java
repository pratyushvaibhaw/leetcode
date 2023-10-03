// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
// Example 3:

// Input: nums = [1,2,3]
// Output: 0
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; // Initialize a counter to keep track of the number of good pairs
        Map<Integer, Integer> numCount = new HashMap<>(); // Create a HashMap to store counts of each number

        for (int num : nums) {
            // Get the current count for the current number (default to 0 if not found)
            int currentCount = numCount.getOrDefault(num, 0);
            
            // Increment the count by the number of existing occurrences of the same number
            count += currentCount;
            
            // Update the count for the current number in the HashMap
            numCount.put(num, currentCount + 1);
        }

        return count; // Return the total count of good pairs
    }
}
