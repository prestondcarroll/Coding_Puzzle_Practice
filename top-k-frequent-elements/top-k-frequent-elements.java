class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //input: array of numbers, k -> number of elements
        //  to return that are the most frequent
        //output: array in any order of most frequent elements
        //constraints: 1 - 10^5 elements
        //edge cases: all the same element but k is 2
        
        //[1,1,1,2,2,3]
        
        //      1
        //     / \
        //    1   1
        //   / \ / \
        //  2   2,3  
        
        //make min heap from nums
        //have first be first in return array (peek)
        //pop from heap until it changes
        //decrement k
        //repeat process until k is 0
        
        //do count of each in hashmap
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n,0) + 1);
        }
        
        
        
        int[] result = new int[k];
        Queue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        
        for(int n: count.keySet()){
            minHeap.add(n);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        int i = 0;
        while(k > 0){
            result[i] = minHeap.peek();
            while(minHeap.peek() != null && minHeap.peek() == result[i]){
                minHeap.remove();
            }
            i++;
            k--;
        }
        return result;
    }
}