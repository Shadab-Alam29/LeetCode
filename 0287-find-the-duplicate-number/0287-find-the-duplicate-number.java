class Solution { 
public int findDuplicate(int[] nums) { 
    //     int slow = nums[0]; 
    //     int fast = nums[0]; 
    // do { 
    //     slow = nums[slow]; 
    //     fast = nums[nums[fast]]; 
    // } while (slow != fast); 
    //     slow = nums[0]; 
    // while (slow != fast) { 
    //     slow = nums[slow]; 
    //     fast = nums[fast]; 
    // } 
    // return slow; 
    
    int arr[] = new int [nums.length];
    for (int x : nums){
        arr[x]++;
        if (arr[x] == 2 ) return x ;
    }
    return 0;
    } 
}