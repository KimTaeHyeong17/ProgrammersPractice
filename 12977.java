class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            for(int j = i+1 ; j < len ; j++){
                for(int k = j+1 ; k < len ; k ++){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        // System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public boolean isPrime(int num){
        int n;
        for(n = 2 ; n < num ; n++){
            if(num%n == 0){
                return false;
            }
        }
        return true;
    }
}
