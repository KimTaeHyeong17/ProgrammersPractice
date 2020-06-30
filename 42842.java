class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int i = 1 ; i < sum ; i++){
            int j = sum/i;
            // System.out.println("width : " + i + " height : " + j);
            if(i>2 && j >2){
                int yblock = (i-2)*(j-2);
                if(yblock == yellow){
                    // System.out.println("yblock : " + yblock);     
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}
