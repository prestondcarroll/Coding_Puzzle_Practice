class Solution {
    public void sortColors(int[] nums) {                
        //input: array of nums
        //output: input array will be sorted in place
        //constraints: 1-300
        //edge: size 1
        
        //[2,0,2,1,1,0]
        
        //p0 rightmost boundary of 0's
        //p2 leftmost boundary of 2's
        //current
        
        //p0 = 0
        //p2 = n-1
        //curr = 0
        
        //while curr < p2
        //if nums[curr] == 0 
        //  swap curr and p0
        //  move both to right
        //if nums[curr] = 2
        //  swap curr and p2
        //  move p2 to left
        //if curr = 1
        //  move pointer curr to right
        
        int p0 = 0;
        int p2 = nums.length - 1;
        int curr = 0;
        
        while(curr <= p2){
            if(nums[curr] == 0){
                swap(nums,curr, p0);
                curr++;
                p0++;
            }
            else if(nums[curr] == 2){
                swap(nums, curr, p2);
                p2--;
            }
            else{
                curr++;
            }
        }
        
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}