class Solution {
    public int[] solution(int[] heights) {
        int len = heights.length;
        int[] answer = new int[len];
        
        for(int i = len-1; i > -1 ; i--){
            // System.out.println(heights[i]);
            int item = heights[i];
            for(int j = i ; j > -1 ; j--){
                if(heights[j] > item){
                    answer[i] = j+1;
                    break;
                }
            }
     
        }
        return answer;
    }
}
