import java.util.*;
class Solution {
    HashSet<Integer> set = new HashSet<>();
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int pok : nums){
            set.add(pok);
            if(set.size() == nums.length/2){
                break;
            }
        }
        return set.size();
      
    }
}
