Return distinct values from a list including duplicates
Given {1, 2, 6, 6, 6, 10, 14, 14}; Return -> {1, 2, 6, 10, 14}
// UNDERSTAND
        - Is the input always sorted?
        - are inputs always only integers?
        - Given {1, 1, 1}; Return {1}
        - Given {1, 2, 3}; Return {1, 2, 3}
        - Given {15, 6, 10, 5, 12, 6}; Return {15, 6, 10, 5, 12} -- Recommend using a hash set/hash table
        - Given {5, 6, 6, 10, 12, 15};
        - Does it matter the order we return the list in?
// MATCH
/*        - Are there any common patterns we can apply here?
        - Hash table
        - Sort our input first*/
// PLAN
        Possible solutions:
        //(1) iterate through array, put values in hash table, if value already exsits, don't add to numsToReturn
        //(2) Sort array, add integer to numsToreturn if previous integer is not the same
// IMPLEMENT
        import java.util.HashSet; // Import the HashSet class
        public class DistictValues{

                public static void main(String[] args) {
                        int[] nums = {5, 6, 6, 10, 12, 15};
                        System.out.println(ArrayList.toString(numsToReturn(nums)))        
                }
                public static int[] numsToReturn distinctValues(int[] nums){
                        HashSet<Integer> set = new HashSet<Inetger>(); // Unique key holder for new nums
                        for (int i = 0; i < nums.length(); i++){
                                // If our set does not already contain the number, we add it to the set
                                int currNum = nums[i];
                                if (!set.contains(currNum)){
                                        set.add(currNum);
                                }
                        }
                        // Return numsToReturn, store nums from set into new array                        
                        int[] numsToReturn = [set.size()];
                        for (Integer i: set){
                               numsToReturn.add(i); 
                        }
                }
        }
// REVIEW

// EVALUATE